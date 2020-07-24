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

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取image_url
     *
     * @return image_url - image_url
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 设置image_url
     *
     * @param imageUrl image_url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 获取background_color
     *
     * @return background_color - background_color
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * 设置background_color
     *
     * @param backgroundColor background_color
     */
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * 获取item_id
     *
     * @return item_id - item_id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置item_id
     *
     * @param itemId item_id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取category_id
     *
     * @return category_id - category_id
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * 设置category_id
     *
     * @param categoryId category_id
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取type
     *
     * @return type - type
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置type
     *
     * @param type type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取order_num
     *
     * @return order_num - order_num
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * 设置order_num
     *
     * @param orderNum order_num
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 获取is_visible
     *
     * @return is_visible - is_visible
     */
    public Integer getIsVisible() {
        return isVisible;
    }

    /**
     * 设置is_visible
     *
     * @param isVisible is_visible
     */
    public void setIsVisible(Integer isVisible) {
        this.isVisible = isVisible;
    }

    /**
     * 获取create_time
     *
     * @return create_time - create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置create_time
     *
     * @param createTime create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取update_time
     *
     * @return update_time - update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置update_time
     *
     * @param updateTime update_time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}