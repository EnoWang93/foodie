package com.yinuo.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Items {
    /**
     * id
     */
    @Id
    private String id;

    /**
     * item_name
     */
    @Column(name = "item_name")
    private String itemName;

    /**
     * category_id
     */
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * root_cat_id
     */
    @Column(name = "root_cat_id")
    private Integer rootCatId;

    /**
     * sell_counts
     */
    @Column(name = "sell_counts")
    private Integer sellCounts;

    /**
     * online_status
     */
    @Column(name = "online_status")
    private Integer onlineStatus;

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
     * content
     */
    private String content;

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
     * 获取item_name
     *
     * @return item_name - item_name
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置item_name
     *
     * @param itemName item_name
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获取category_id
     *
     * @return category_id - category_id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置category_id
     *
     * @param categoryId category_id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取root_cat_id
     *
     * @return root_cat_id - root_cat_id
     */
    public Integer getRootCatId() {
        return rootCatId;
    }

    /**
     * 设置root_cat_id
     *
     * @param rootCatId root_cat_id
     */
    public void setRootCatId(Integer rootCatId) {
        this.rootCatId = rootCatId;
    }

    /**
     * 获取sell_counts
     *
     * @return sell_counts - sell_counts
     */
    public Integer getSellCounts() {
        return sellCounts;
    }

    /**
     * 设置sell_counts
     *
     * @param sellCounts sell_counts
     */
    public void setSellCounts(Integer sellCounts) {
        this.sellCounts = sellCounts;
    }

    /**
     * 获取online_status
     *
     * @return online_status - online_status
     */
    public Integer getOnlineStatus() {
        return onlineStatus;
    }

    /**
     * 设置online_status
     *
     * @param onlineStatus online_status
     */
    public void setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
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

    /**
     * 获取content
     *
     * @return content - content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置content
     *
     * @param content content
     */
    public void setContent(String content) {
        this.content = content;
    }
}