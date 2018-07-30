package com.study.cloud.model.po;

import java.math.BigDecimal;

/**
 * 菜谱表
 * 
 * @author wcyong
 * 
 * @date 2018-07-30
 */
public class BbqMenu {
    /**
     * 主键
     */
    private Long id;

    /**
     * 菜名
     */
    private String name;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 最小商品单位
     */
    private String sku;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }
}