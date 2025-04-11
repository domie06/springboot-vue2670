package com.dao;

import com.entity.ShoujiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoujiCollectionView;

/**
 * 手机收藏 Dao 接口
 *
 * @author 
 */
public interface ShoujiCollectionDao extends BaseMapper<ShoujiCollectionEntity> {

   List<ShoujiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
