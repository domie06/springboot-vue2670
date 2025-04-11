package com.entity.vo;

import com.entity.ShoujiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 手机
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shouji")
public class ShoujiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 手机名称
     */

    @TableField(value = "shouji_name")
    private String shoujiName;


    /**
     * 手机照片
     */

    @TableField(value = "shouji_photo")
    private String shoujiPhoto;


    /**
     * 手机型号
     */

    @TableField(value = "shouji_types")
    private Integer shoujiTypes;


    /**
     * 手机库存
     */

    @TableField(value = "shouji_kucun_number")
    private Integer shoujiKucunNumber;


    /**
     * 购买获得积分
     */

    @TableField(value = "shouji_price")
    private Integer shoujiPrice;


    /**
     * 手机原价
     */

    @TableField(value = "shouji_old_money")
    private Double shoujiOldMoney;


    /**
     * 现价/积分
     */

    @TableField(value = "shouji_new_money")
    private Double shoujiNewMoney;


    /**
     * 点击次数
     */

    @TableField(value = "shouji_clicknum")
    private Integer shoujiClicknum;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "shouji_delete")
    private Integer shoujiDelete;


    /**
     * 手机介绍
     */

    @TableField(value = "shouji_content")
    private String shoujiContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：手机名称
	 */
    public String getShoujiName() {
        return shoujiName;
    }


    /**
	 * 获取：手机名称
	 */

    public void setShoujiName(String shoujiName) {
        this.shoujiName = shoujiName;
    }
    /**
	 * 设置：手机照片
	 */
    public String getShoujiPhoto() {
        return shoujiPhoto;
    }


    /**
	 * 获取：手机照片
	 */

    public void setShoujiPhoto(String shoujiPhoto) {
        this.shoujiPhoto = shoujiPhoto;
    }
    /**
	 * 设置：手机型号
	 */
    public Integer getShoujiTypes() {
        return shoujiTypes;
    }


    /**
	 * 获取：手机型号
	 */

    public void setShoujiTypes(Integer shoujiTypes) {
        this.shoujiTypes = shoujiTypes;
    }
    /**
	 * 设置：手机库存
	 */
    public Integer getShoujiKucunNumber() {
        return shoujiKucunNumber;
    }


    /**
	 * 获取：手机库存
	 */

    public void setShoujiKucunNumber(Integer shoujiKucunNumber) {
        this.shoujiKucunNumber = shoujiKucunNumber;
    }
    /**
	 * 设置：购买获得积分
	 */
    public Integer getShoujiPrice() {
        return shoujiPrice;
    }


    /**
	 * 获取：购买获得积分
	 */

    public void setShoujiPrice(Integer shoujiPrice) {
        this.shoujiPrice = shoujiPrice;
    }
    /**
	 * 设置：手机原价
	 */
    public Double getShoujiOldMoney() {
        return shoujiOldMoney;
    }


    /**
	 * 获取：手机原价
	 */

    public void setShoujiOldMoney(Double shoujiOldMoney) {
        this.shoujiOldMoney = shoujiOldMoney;
    }
    /**
	 * 设置：现价/积分
	 */
    public Double getShoujiNewMoney() {
        return shoujiNewMoney;
    }


    /**
	 * 获取：现价/积分
	 */

    public void setShoujiNewMoney(Double shoujiNewMoney) {
        this.shoujiNewMoney = shoujiNewMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getShoujiClicknum() {
        return shoujiClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setShoujiClicknum(Integer shoujiClicknum) {
        this.shoujiClicknum = shoujiClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getShoujiDelete() {
        return shoujiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setShoujiDelete(Integer shoujiDelete) {
        this.shoujiDelete = shoujiDelete;
    }
    /**
	 * 设置：手机介绍
	 */
    public String getShoujiContent() {
        return shoujiContent;
    }


    /**
	 * 获取：手机介绍
	 */

    public void setShoujiContent(String shoujiContent) {
        this.shoujiContent = shoujiContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
