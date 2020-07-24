package com.yinuo.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Carousel {
    @Id
    private String id;

    /**
     * image_url
     */
    @Column(name = "image_url")
    private String imageUrl;

    /**
     * background_color
     */
    @Column(name = "background_color")
    private String backgroundColor;

    /**
     * item_id
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * category_id
     */
    @Column(name = "category_id")
    private String categoryId;

    /**
     * type
     */
    private Integer type;

    /**
     * order_num
     */
    @Column(name = "order_num")
    private Integer orderNum;

    /**
     * is_visible
     */
    @Column(name = "is_visible")
    private Integer isVisible;

    /**
     * create_time
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * update_time
     */
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