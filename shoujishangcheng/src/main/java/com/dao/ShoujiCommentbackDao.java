package com.dao;

import com.entity.ShoujiCommentbackEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoujiCommentbackView;

/**
 * 手机评价 Dao 接口
 *
 * @author 
 */
public interface ShoujiCommentbackDao extends BaseMapper<ShoujiCommentbackEntity> {

   List<ShoujiCommentbackView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
