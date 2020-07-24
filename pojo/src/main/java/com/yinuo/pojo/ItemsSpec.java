package com.yinuo.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "items_spec")
public class ItemsSpec {
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
     * name
     */
    private String name;

    /**
     * inventory
     */
    private Integer inventory;

    /**
     * discounts
     */
    private BigDecimal discounts;

    /**
     * price_discount
     */
    @Column(name = "price_discount")
    private Integer priceDiscount;

    /**
     * original_price
     */
    @Column(name = "original_price")
    private Integer originalPrice;

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
     * 获取name
     *
     * @return name - name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取inventory
     *
     * @return inventory - inventory
     */
    public Integer getInventory() {
        return inventory;
    }

    /**
     * 设置inventory
     *
     * @param inventory inventory
     */
    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    /**
     * 获取discounts
     *
     * @return discounts - discounts
     */
    public BigDecimal getDiscounts() {
        return discounts;
    }

    /**
     * 设置discounts
     *
     * @param discounts discounts
     */
    public void setDiscounts(BigDecimal discounts) {
        this.discounts = discounts;
    }

    /**
     * 获取price_discount
     *
     * @return price_discount - price_discount
     */
    public Integer getPriceDiscount() {
        return priceDiscount;
    }

    /**
     * 设置price_discount
     *
     * @param priceDiscount price_discount
     */
    public void setPriceDiscount(Integer priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    /**
     * 获取original_price
     *
     * @return original_price - original_price
     */
    public Integer getOriginalPrice() {
        return originalPrice;
    }

    /**
     * 设置original_price
     *
     * @param originalPrice original_price
     */
    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
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