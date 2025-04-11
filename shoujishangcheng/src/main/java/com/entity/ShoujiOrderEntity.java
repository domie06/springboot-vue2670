package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 手机订单
 *
 * @author 
 * @email
 */
@TableName("shouji_order")
public class ShoujiOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShoujiOrderEntity() {

	}

	public ShoujiOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 订单号
     */
    @TableField(value = "shouji_order_uuid_number")

    private String shoujiOrderUuidNumber;


    /**
     * 收获地址
     */
    @TableField(value = "address_id")

    private Integer addressId;


    /**
     * 手机
     */
    @TableField(value = "shouji_id")

    private Integer shoujiId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 购买数量
     */
    @TableField(value = "buy_number")

    private Integer buyNumber;


    /**
     * 实付价格
     */
    @TableField(value = "shouji_order_true_price")

    private Double shoujiOrderTruePrice;


    /**
     * 订单类型
     */
    @TableField(value = "shouji_order_types")

    private Integer shoujiOrderTypes;


    /**
     * 支付类型
     */
    @TableField(value = "shouji_order_payment_types")

    private Integer shoujiOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：订单号
	 */
    public String getShoujiOrderUuidNumber() {
        return shoujiOrderUuidNumber;
    }


    /**
	 * 获取：订单号
	 */

    public void setShoujiOrderUuidNumber(String shoujiOrderUuidNumber) {
        this.shoujiOrderUuidNumber = shoujiOrderUuidNumber;
    }
    /**
	 * 设置：收获地址
	 */
    public Integer getAddressId() {
        return addressId;
    }


    /**
	 * 获取：收获地址
	 */

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
    /**
	 * 设置：手机
	 */
    public Integer getShoujiId() {
        return shoujiId;
    }


    /**
	 * 获取：手机
	 */

    public void setShoujiId(Integer shoujiId) {
        this.shoujiId = shoujiId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 获取：购买数量
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getShoujiOrderTruePrice() {
        return shoujiOrderTruePrice;
    }


    /**
	 * 获取：实付价格
	 */

    public void setShoujiOrderTruePrice(Double shoujiOrderTruePrice) {
        this.shoujiOrderTruePrice = shoujiOrderTruePrice;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getShoujiOrderTypes() {
        return shoujiOrderTypes;
    }


    /**
	 * 获取：订单类型
	 */

    public void setShoujiOrderTypes(Integer shoujiOrderTypes) {
        this.shoujiOrderTypes = shoujiOrderTypes;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getShoujiOrderPaymentTypes() {
        return shoujiOrderPaymentTypes;
    }


    /**
	 * 获取：支付类型
	 */

    public void setShoujiOrderPaymentTypes(Integer shoujiOrderPaymentTypes) {
        this.shoujiOrderPaymentTypes = shoujiOrderPaymentTypes;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ShoujiOrder{" +
            "id=" + id +
            ", shoujiOrderUuidNumber=" + shoujiOrderUuidNumber +
            ", addressId=" + addressId +
            ", shoujiId=" + shoujiId +
            ", yonghuId=" + yonghuId +
            ", buyNumber=" + buyNumber +
            ", shoujiOrderTruePrice=" + shoujiOrderTruePrice +
            ", shoujiOrderTypes=" + shoujiOrderTypes +
            ", shoujiOrderPaymentTypes=" + shoujiOrderPaymentTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
