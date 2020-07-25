package com.yinuo.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "item_img")
public class ItemImg {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getIsMain() {
        return isMain;
    }

    public void setIsMain(Integer isMain) {
        this.isMain = isMain;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}