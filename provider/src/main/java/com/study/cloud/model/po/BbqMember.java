package com.study.cloud.model.po;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 客户表
 * 
 * @author wcyong
 * 
 * @date 2018-07-30
 */
public class BbqMember {
    private Long id;

    /**
     * 客户名称
     */
    private String name;

    /**
     * 电话号
     */
    private String telPhone;

    /**
     * 该客户总计消费
     */
    private BigDecimal amountTotal;

    /**
     * 客户生日
     */
    private Date birthday;

    /**
     * 客户状态
     */
    private Boolean status;

    /**
     * 客户级别
     */
    private Integer level;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone == null ? null : telPhone.trim();
    }

    public BigDecimal getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(BigDecimal amountTotal) {
        this.amountTotal = amountTotal;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}