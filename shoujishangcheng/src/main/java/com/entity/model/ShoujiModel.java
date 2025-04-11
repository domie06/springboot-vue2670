package com.entity.model;

import com.entity.ShoujiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 手机
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShoujiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 逻辑删除
     */
    private Integer shoujiDelete;


    /**
     * 手机介绍
     */
    private String shoujiContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：手机名称
	 */
    public String getShoujiName() {
        return shoujiName;
    }


    /**
	 * 设置：手机名称
	 */
    public void setShoujiName(String shoujiName) {
        this.shoujiName = shoujiName;
    }
    /**
	 * 获取：手机照片
	 */
    public String getShoujiPhoto() {
        return shoujiPhoto;
    }


    /**
	 * 设置：手机照片
	 */
    public void setShoujiPhoto(String shoujiPhoto) {
        this.shoujiPhoto = shoujiPhoto;
    }
    /**
	 * 获取：手机型号
	 */
    public Integer getShoujiTypes() {
        return shoujiTypes;
    }


    /**
	 * 设置：手机型号
	 */
    public void setShoujiTypes(Integer shoujiTypes) {
        this.shoujiTypes = shoujiTypes;
    }
    /**
	 * 获取：手机库存
	 */
    public Integer getShoujiKucunNumber() {
        return shoujiKucunNumber;
    }


    /**
	 * 设置：手机库存
	 */
    public void setShoujiKucunNumber(Integer shoujiKucunNumber) {
        this.shoujiKucunNumber = shoujiKucunNumber;
    }
    /**
	 * 获取：购买获得积分
	 */
    public Integer getShoujiPrice() {
        return shoujiPrice;
    }


    /**
	 * 设置：购买获得积分
	 */
    public void setShoujiPrice(Integer shoujiPrice) {
        this.shoujiPrice = shoujiPrice;
    }
    /**
	 * 获取：手机原价
	 */
    public Double getShoujiOldMoney() {
        return shoujiOldMoney;
    }


    /**
	 * 设置：手机原价
	 */
    public void setShoujiOldMoney(Double shoujiOldMoney) {
        this.shoujiOldMoney = shoujiOldMoney;
    }
    /**
	 * 获取：现价/积分
	 */
    public Double getShoujiNewMoney() {
        return shoujiNewMoney;
    }


    /**
	 * 设置：现价/积分
	 */
    public void setShoujiNewMoney(Double shoujiNewMoney) {
        this.shoujiNewMoney = shoujiNewMoney;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getShoujiClicknum() {
        return shoujiClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setShoujiClicknum(Integer shoujiClicknum) {
        this.shoujiClicknum = shoujiClicknum;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getShoujiDelete() {
        return shoujiDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setShoujiDelete(Integer shoujiDelete) {
        this.shoujiDelete = shoujiDelete;
    }
    /**
	 * 获取：手机介绍
	 */
    public String getShoujiContent() {
        return shoujiContent;
    }


    /**
	 * 设置：手机介绍
	 */
    public void setShoujiContent(String shoujiContent) {
        this.shoujiContent = shoujiContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
