package com.entity.view;

import com.entity.CartEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 购物车
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("cart")
public class CartView extends CartEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 shouji
			/**
			* 手机名称
			*/
			private String shoujiName;
			/**
			* 手机照片
			*/
			private String shoujiPhoto;
			/**
			* 手机型号
			*/
			private Integer shoujiTypes;
				/**
				* 手机型号的值
				*/
				private String shoujiValue;
			/**
			* 手机库存
			*/
			private Integer shoujiKucunNumber;
			/**
			* 购买获得积分
			*/
			private Integer shoujiPrice;
			/**
			* 手机原价
			*/
			private Double shoujiOldMoney;
			/**
			* 现价/积分
			*/
			private Double shoujiNewMoney;
			/**
			* 点击次数
			*/
			private Integer shoujiClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer shoujiDelete;
			/**
			* 手机介绍
			*/
			private String shoujiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 总积分
			*/
			private Double yonghuSumJifen;
			/**
			* 现积分
			*/
			private Double yonghuNewJifen;
			/**
			* 会员等级
			*/
			private Integer huiyuandengjiTypes;
				/**
				* 会员等级的值
				*/
				private String huiyuandengjiValue;

	public CartView() {

	}

	public CartView(CartEntity cartEntity) {
		try {
			BeanUtils.copyProperties(this, cartEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}























				//级联表的get和set shouji
					/**
					* 获取： 手机名称
					*/
					public String getShoujiName() {
						return shoujiName;
					}
					/**
					* 设置： 手机名称
					*/
					public void setShoujiName(String shoujiName) {
						this.shoujiName = shoujiName;
					}
					/**
					* 获取： 手机照片
					*/
					public String getShoujiPhoto() {
						return shoujiPhoto;
					}
					/**
					* 设置： 手机照片
					*/
					public void setShoujiPhoto(String shoujiPhoto) {
						this.shoujiPhoto = shoujiPhoto;
					}
					/**
					* 获取： 手机型号
					*/
					public Integer getShoujiTypes() {
						return shoujiTypes;
					}
					/**
					* 设置： 手机型号
					*/
					public void setShoujiTypes(Integer shoujiTypes) {
						this.shoujiTypes = shoujiTypes;
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
					* 获取： 手机库存
					*/
					public Integer getShoujiKucunNumber() {
						return shoujiKucunNumber;
					}
					/**
					* 设置： 手机库存
					*/
					public void setShoujiKucunNumber(Integer shoujiKucunNumber) {
						this.shoujiKucunNumber = shoujiKucunNumber;
					}
					/**
					* 获取： 购买获得积分
					*/
					public Integer getShoujiPrice() {
						return shoujiPrice;
					}
					/**
					* 设置： 购买获得积分
					*/
					public void setShoujiPrice(Integer shoujiPrice) {
						this.shoujiPrice = shoujiPrice;
					}
					/**
					* 获取： 手机原价
					*/
					public Double getShoujiOldMoney() {
						return shoujiOldMoney;
					}
					/**
					* 设置： 手机原价
					*/
					public void setShoujiOldMoney(Double shoujiOldMoney) {
						this.shoujiOldMoney = shoujiOldMoney;
					}
					/**
					* 获取： 现价/积分
					*/
					public Double getShoujiNewMoney() {
						return shoujiNewMoney;
					}
					/**
					* 设置： 现价/积分
					*/
					public void setShoujiNewMoney(Double shoujiNewMoney) {
						this.shoujiNewMoney = shoujiNewMoney;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getShoujiClicknum() {
						return shoujiClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setShoujiClicknum(Integer shoujiClicknum) {
						this.shoujiClicknum = shoujiClicknum;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
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
					/**
					* 获取： 逻辑删除
					*/
					public Integer getShoujiDelete() {
						return shoujiDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setShoujiDelete(Integer shoujiDelete) {
						this.shoujiDelete = shoujiDelete;
					}
					/**
					* 获取： 手机介绍
					*/
					public String getShoujiContent() {
						return shoujiContent;
					}
					/**
					* 设置： 手机介绍
					*/
					public void setShoujiContent(String shoujiContent) {
						this.shoujiContent = shoujiContent;
					}











				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}
					/**
					* 获取： 总积分
					*/
					public Double getYonghuSumJifen() {
						return yonghuSumJifen;
					}
					/**
					* 设置： 总积分
					*/
					public void setYonghuSumJifen(Double yonghuSumJifen) {
						this.yonghuSumJifen = yonghuSumJifen;
					}
					/**
					* 获取： 现积分
					*/
					public Double getYonghuNewJifen() {
						return yonghuNewJifen;
					}
					/**
					* 设置： 现积分
					*/
					public void setYonghuNewJifen(Double yonghuNewJifen) {
						this.yonghuNewJifen = yonghuNewJifen;
					}
					/**
					* 获取： 会员等级
					*/
					public Integer getHuiyuandengjiTypes() {
						return huiyuandengjiTypes;
					}
					/**
					* 设置： 会员等级
					*/
					public void setHuiyuandengjiTypes(Integer huiyuandengjiTypes) {
						this.huiyuandengjiTypes = huiyuandengjiTypes;
					}


						/**
						* 获取： 会员等级的值
						*/
						public String getHuiyuandengjiValue() {
							return huiyuandengjiValue;
						}
						/**
						* 设置： 会员等级的值
						*/
						public void setHuiyuandengjiValue(String huiyuandengjiValue) {
							this.huiyuandengjiValue = huiyuandengjiValue;
						}




}
