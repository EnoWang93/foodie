package com.yinuo.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "items_img")
public class ItemsImg {
    /**
     * id
     */
    @Id
    private String id;

    /**
     * item_id
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * url
     */
    private String url;

    /**
     * order_num
     */
    @Column(name = "order_num")
    private Integer orderNum;

    /**
     * is_main
     */
    @Column(name = "is_main")
    private Integer isMain;

    /**
     * created_time
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * updated_time
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 获取id
     *
     * @return id - id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
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
     * 获取url
     *
     * @return url - url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置url
     *
     * @param url url
     */
    public void setUrl(String url) {
        this.url = url;
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
     * 获取is_main
     *
     * @return is_main - is_main
     */
    public Integer getIsMain() {
        return isMain;
    }

    /**
     * 设置is_main
     *
     * @param isMain is_main
     */
    public void setIsMain(Integer isMain) {
        this.isMain = isMain;
    }

    /**
     * 获取created_time
     *
     * @return created_time - created_time
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置created_time
     *
     * @param createdTime created_time
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取updated_time
     *
     * @return updated_time - updated_time
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置updated_time
     *
     * @param updatedTime updated_time
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}