package com.yinuo.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "items_param")
public class ItemsParam {
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
     * 获取made_by
     *
     * @return made_by - made_by
     */
    public String getMadeBy() {
        return madeBy;
    }

    /**
     * 设置made_by
     *
     * @param madeBy made_by
     */
    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    /**
     * 获取best_date
     *
     * @return best_date - best_date
     */
    public String getBestDate() {
        return bestDate;
    }

    /**
     * 设置best_date
     *
     * @param bestDate best_date
     */
    public void setBestDate(String bestDate) {
        this.bestDate = bestDate;
    }

    /**
     * 获取brand
     *
     * @return brand - brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置brand
     *
     * @param brand brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取factory_name
     *
     * @return factory_name - factory_name
     */
    public String getFactoryName() {
        return factoryName;
    }

    /**
     * 设置factory_name
     *
     * @param factoryName factory_name
     */
    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    /**
     * 获取factory_address
     *
     * @return factory_address - factory_address
     */
    public String getFactoryAddress() {
        return factoryAddress;
    }

    /**
     * 设置factory_address
     *
     * @param factoryAddress factory_address
     */
    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress;
    }

    /**
     * 获取packaging_method
     *
     * @return packaging_method - packaging_method
     */
    public String getPackagingMethod() {
        return packagingMethod;
    }

    /**
     * 设置packaging_method
     *
     * @param packagingMethod packaging_method
     */
    public void setPackagingMethod(String packagingMethod) {
        this.packagingMethod = packagingMethod;
    }

    /**
     * 获取weight
     *
     * @return weight - weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设置weight
     *
     * @param weight weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * 获取storage_method
     *
     * @return storage_method - storage_method
     */
    public String getStorageMethod() {
        return storageMethod;
    }

    /**
     * 设置storage_method
     *
     * @param storageMethod storage_method
     */
    public void setStorageMethod(String storageMethod) {
        this.storageMethod = storageMethod;
    }

    /**
     * 获取use_method
     *
     * @return use_method - use_method
     */
    public String getUseMethod() {
        return useMethod;
    }

    /**
     * 设置use_method
     *
     * @param useMethod use_method
     */
    public void setUseMethod(String useMethod) {
        this.useMethod = useMethod;
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