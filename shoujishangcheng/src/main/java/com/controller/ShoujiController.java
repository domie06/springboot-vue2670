
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 手机
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shouji")
public class ShoujiController {
    private static final Logger logger = LoggerFactory.getLogger(ShoujiController.class);

    @Autowired
    private ShoujiService shoujiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("shoujiDeleteStart",1);params.put("shoujiDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = shoujiService.queryPage(params);

        //字典表数据转换
        List<ShoujiView> list =(List<ShoujiView>)page.getList();
        for(ShoujiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShoujiEntity shouji = shoujiService.selectById(id);
        if(shouji !=null){
            //entity转view
            ShoujiView view = new ShoujiView();
            BeanUtils.copyProperties( shouji , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShoujiEntity shouji, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shouji:{}",this.getClass().getName(),shouji.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ShoujiEntity> queryWrapper = new EntityWrapper<ShoujiEntity>()
            .eq("shouji_name", shouji.getShoujiName())
            .eq("shouji_types", shouji.getShoujiTypes())
            .eq("shouji_kucun_number", shouji.getShoujiKucunNumber())
            .eq("shouji_price", shouji.getShoujiPrice())
            .eq("shouji_clicknum", shouji.getShoujiClicknum())
            .eq("shangxia_types", shouji.getShangxiaTypes())
            .eq("shouji_delete", shouji.getShoujiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShoujiEntity shoujiEntity = shoujiService.selectOne(queryWrapper);
        if(shoujiEntity==null){
            shouji.setShoujiClicknum(1);
            shouji.setShangxiaTypes(1);
            shouji.setShoujiDelete(1);
            shouji.setCreateTime(new Date());
            shoujiService.insert(shouji);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShoujiEntity shouji, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shouji:{}",this.getClass().getName(),shouji.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<ShoujiEntity> queryWrapper = new EntityWrapper<ShoujiEntity>()
            .notIn("id",shouji.getId())
            .andNew()
            .eq("shouji_name", shouji.getShoujiName())
            .eq("shouji_types", shouji.getShoujiTypes())
            .eq("shouji_kucun_number", shouji.getShoujiKucunNumber())
            .eq("shouji_price", shouji.getShoujiPrice())
            .eq("shouji_clicknum", shouji.getShoujiClicknum())
            .eq("shangxia_types", shouji.getShangxiaTypes())
            .eq("shouji_delete", shouji.getShoujiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShoujiEntity shoujiEntity = shoujiService.selectOne(queryWrapper);
        if("".equals(shouji.getShoujiPhoto()) || "null".equals(shouji.getShoujiPhoto())){
                shouji.setShoujiPhoto(null);
        }
        if(shoujiEntity==null){
            shoujiService.updateById(shouji);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<ShoujiEntity> list = new ArrayList<>();
        for(Integer id:ids){
            ShoujiEntity shoujiEntity = new ShoujiEntity();
            shoujiEntity.setId(id);
            shoujiEntity.setShoujiDelete(2);
            list.add(shoujiEntity);
        }
        if(list != null && list.size() >0){
            shoujiService.updateBatchById(list);
        }
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<ShoujiEntity> shoujiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ShoujiEntity shoujiEntity = new ShoujiEntity();
//                            shoujiEntity.setShoujiName(data.get(0));                    //手机名称 要改的
//                            shoujiEntity.setShoujiPhoto("");//照片
//                            shoujiEntity.setShoujiTypes(Integer.valueOf(data.get(0)));   //手机型号 要改的
//                            shoujiEntity.setShoujiKucunNumber(Integer.valueOf(data.get(0)));   //手机库存 要改的
//                            shoujiEntity.setShoujiPrice(Integer.valueOf(data.get(0)));   //购买获得积分 要改的
//                            shoujiEntity.setShoujiOldMoney(data.get(0));                    //手机原价 要改的
//                            shoujiEntity.setShoujiNewMoney(data.get(0));                    //现价/积分 要改的
//                            shoujiEntity.setShoujiClicknum(Integer.valueOf(data.get(0)));   //点击次数 要改的
//                            shoujiEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            shoujiEntity.setShoujiDelete(1);//逻辑删除字段
//                            shoujiEntity.setShoujiContent("");//照片
//                            shoujiEntity.setCreateTime(date);//时间
                            shoujiList.add(shoujiEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        shoujiService.insertBatch(shoujiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = shoujiService.queryPage(params);

        //字典表数据转换
        List<ShoujiView> list =(List<ShoujiView>)page.getList();
        for(ShoujiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShoujiEntity shouji = shoujiService.selectById(id);
            if(shouji !=null){

                //点击数量加1
                shouji.setShoujiClicknum(shouji.getShoujiClicknum()+1);
                shoujiService.updateById(shouji);

                //entity转view
                ShoujiView view = new ShoujiView();
                BeanUtils.copyProperties( shouji , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ShoujiEntity shouji, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,shouji:{}",this.getClass().getName(),shouji.toString());
        Wrapper<ShoujiEntity> queryWrapper = new EntityWrapper<ShoujiEntity>()
            .eq("shouji_name", shouji.getShoujiName())
            .eq("shouji_types", shouji.getShoujiTypes())
            .eq("shouji_kucun_number", shouji.getShoujiKucunNumber())
            .eq("shouji_price", shouji.getShoujiPrice())
            .eq("shouji_clicknum", shouji.getShoujiClicknum())
            .eq("shangxia_types", shouji.getShangxiaTypes())
            .eq("shouji_delete", shouji.getShoujiDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShoujiEntity shoujiEntity = shoujiService.selectOne(queryWrapper);
        if(shoujiEntity==null){
            shouji.setShoujiDelete(1);
            shouji.setCreateTime(new Date());
        shoujiService.insert(shouji);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
