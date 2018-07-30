package com.study.cloud.model.po;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单表
 * 
 * @author wcyong
 * 
 * @date 2018-07-30
 */
public class BbqOrder {
    /**
     * 主键
     */
    private Long id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 桌号
     */
    private Integer tableNo;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 实收
     */
    private BigDecimal price;

    /**
     * 应收
     */
    private BigDecimal priceAll;

    /**
     * 客户id
     */
    private Long memberId;

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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getTableNo() {
        return tableNo;
    }

    public void setTableNo(Integer tableNo) {
        this.tableNo = tableNo;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPriceAll() {
        return priceAll;
    }

    public void setPriceAll(BigDecimal priceAll) {
        this.priceAll = priceAll;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}