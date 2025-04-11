package com.dao;

import com.entity.ShoujiOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoujiOrderView;

/**
 * 手机订单 Dao 接口
 *
 * @author 
 */
public interface ShoujiOrderDao extends BaseMapper<ShoujiOrderEntity> {

   List<ShoujiOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
