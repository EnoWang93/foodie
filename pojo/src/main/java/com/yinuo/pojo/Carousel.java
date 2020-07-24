package com.yinuo.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Carousel {
    @Id
    private String id;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "background_color")
    private String backgroundColor;

    @Column(name = "item_id")
    private String itemId;

    @Column(name = "category_id")
    private String categoryId;

    private Integer type;

    @Column(name = "order_num")
    private Integer orderNum;

    @Column(name = "is_visible")
    private Integer isVisible;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getCategoryId() {
        return categoryId;
    }


    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Integer isVisible) {
        this.isVisible = isVisible;
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