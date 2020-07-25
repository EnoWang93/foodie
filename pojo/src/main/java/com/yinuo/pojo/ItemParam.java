package com.yinuo.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "item_param")
public class ItemParam {
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
     * made_by
     */
    @Column(name = "made_by")
    private String madeBy;

    /**
     * best_date
     */
    @Column(name = "best_date")
    private String bestDate;

    /**
     * brand
     */
    private String brand;

    /**
     * factory_name
     */
    @Column(name = "factory_name")
    private String factoryName;

    /**
     * factory_address
     */
    @Column(name = "factory_address")
    private String factoryAddress;

    /**
     * packaging_method
     */
    @Column(name = "packaging_method")
    private String packagingMethod;

    /**
     * weight
     */
    private String weight;

    /**
     * storage_method
     */
    @Column(name = "storage_method")
    private String storageMethod;

    /**
     * use_method
     */
    @Column(name = "use_method")
    private String useMethod;

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

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public String getBestDate() {
        return bestDate;
    }

    public void setBestDate(String bestDate) {
        this.bestDate = bestDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryAddress() {
        return factoryAddress;
    }

    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress;
    }

    public String getPackagingMethod() {
        return packagingMethod;
    }

    public void setPackagingMethod(String packagingMethod) {
        this.packagingMethod = packagingMethod;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getStorageMethod() {
        return storageMethod;
    }

    public void setStorageMethod(String storageMethod) {
        this.storageMethod = storageMethod;
    }

    public String getUseMethod() {
        return useMethod;
    }

    public void setUseMethod(String useMethod) {
        this.useMethod = useMethod;
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