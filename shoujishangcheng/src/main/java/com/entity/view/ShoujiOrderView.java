package com.entity.view;

import com.entity.ShoujiOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 手机订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shouji_order")
public class ShoujiOrderView extends ShoujiOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 订单类型的值
		*/
		private String shoujiOrderValue;
		/**
		* 支付类型的值
		*/
		private String shoujiOrderPaymentValue;



		//级联表 address
			/**
			* 收货地址 的 创建用户
			*/
			private Integer addressYonghuId;
			/**
			* 收货人
			*/
			private String addressName;
			/**
			* 电话
			*/
			private String addressPhone;
			/**
			* 地址
			*/
			private String addressDizhi;
			/**
			* 是否默认地址
			*/
			private Integer isdefaultTypes;
				/**
				* 是否默认地址的值
				*/
				private String isdefaultValue;

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

	public ShoujiOrderView() {

	}

	public ShoujiOrderView(ShoujiOrderEntity shoujiOrderEntity) {
		try {
			BeanUtils.copyProperties(this, shoujiOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 订单类型的值
			*/
			public String getShoujiOrderValue() {
				return shoujiOrderValue;
			}
			/**
			* 设置： 订单类型的值
			*/
			public void setShoujiOrderValue(String shoujiOrderValue) {
				this.shoujiOrderValue = shoujiOrderValue;
			}
			/**
			* 获取： 支付类型的值
			*/
			public String getShoujiOrderPaymentValue() {
				return shoujiOrderPaymentValue;
			}
			/**
			* 设置： 支付类型的值
			*/
			public void setShoujiOrderPaymentValue(String shoujiOrderPaymentValue) {
				this.shoujiOrderPaymentValue = shoujiOrderPaymentValue;
			}




				//级联表的get和set address
					/**
					* 获取：收货地址 的 创建用户
					*/
					public Integer getAddressYonghuId() {
						return addressYonghuId;
					}
					/**
					* 设置：收货地址 的 创建用户
					*/
					public void setAddressYonghuId(Integer addressYonghuId) {
						this.addressYonghuId = addressYonghuId;
					}

					/**
					* 获取： 收货人
					*/
					public String getAddressName() {
						return addressName;
					}
					/**
					* 设置： 收货人
					*/
					public void setAddressName(String addressName) {
						this.addressName = addressName;
					}
					/**
					* 获取： 电话
					*/
					public String getAddressPhone() {
						return addressPhone;
					}
					/**
					* 设置： 电话
					*/
					public void setAddressPhone(String addressPhone) {
						this.addressPhone = addressPhone;
					}
					/**
					* 获取： 地址
					*/
					public String getAddressDizhi() {
						return addressDizhi;
					}
					/**
					* 设置： 地址
					*/
					public void setAddressDizhi(String addressDizhi) {
						this.addressDizhi = addressDizhi;
					}
					/**
					* 获取： 是否默认地址
					*/
					public Integer getIsdefaultTypes() {
						return isdefaultTypes;
					}
					/**
					* 设置： 是否默认地址
					*/
					public void setIsdefaultTypes(Integer isdefaultTypes) {
						this.isdefaultTypes = isdefaultTypes;
					}


						/**
						* 获取： 是否默认地址的值
						*/
						public String getIsdefaultValue() {
							return isdefaultValue;
						}
						/**
						* 设置： 是否默认地址的值
						*/
						public void setIsdefaultValue(String isdefaultValue) {
							this.isdefaultValue = isdefaultValue;
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
