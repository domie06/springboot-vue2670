package com.entity.view;

import com.entity.ShoujiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 手机
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shouji")
public class ShoujiView extends ShoujiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 手机型号的值
		*/
		private String shoujiValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public ShoujiView() {

	}

	public ShoujiView(ShoujiEntity shoujiEntity) {
		try {
			BeanUtils.copyProperties(this, shoujiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 手机型号的值
			*/
			public String getShoujiValue() {
				return shoujiValue;
			}
			/**
			* 设置： 手机型号的值
			*/
			public void setShoujiValue(String shoujiValue) {
				this.shoujiValue = shoujiValue;
			}
			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}













}
