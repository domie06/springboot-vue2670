package com.dao;

import com.entity.ShoujiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoujiView;

/**
 * 手机 Dao 接口
 *
 * @author 
 */
public interface ShoujiDao extends BaseMapper<ShoujiEntity> {

   List<ShoujiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
