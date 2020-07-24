package com.yinuo.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Category {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * level
     */
    private Integer level;

    /**
     * father_id
     */
    @Column(name = "father_id")
    private Integer fatherId;

    /**
     * logo
     */
    private String logo;

    /**
     * slogan
     */
    private String slogan;

    /**
     * category_image
     */
    @Column(name = "category_image")
    private String categoryImage;

    /**
     * bg_color
     */
    @Column(name = "bg_color")
    private String bgColor;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 获取level
     *
     * @return level - level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置level
     *
     * @param level level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取father_id
     *
     * @return father_id - father_id
     */
    public Integer getFatherId() {
        return fatherId;
    }

    /**
     * 设置father_id
     *
     * @param fatherId father_id
     */
    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    /**
     * 获取logo
     *
     * @return logo - logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置logo
     *
     * @param logo logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取slogan
     *
     * @return slogan - slogan
     */
    public String getSlogan() {
        return slogan;
    }

    /**
     * 设置slogan
     *
     * @param slogan slogan
     */
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    /**
     * 获取category_image
     *
     * @return category_image - category_image
     */
    public String getCategoryImage() {
        return categoryImage;
    }

    /**
     * 设置category_image
     *
     * @param categoryImage category_image
     */
    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }

    /**
     * 获取bg_color
     *
     * @return bg_color - bg_color
     */
    public String getBgColor() {
        return bgColor;
    }

    /**
     * 设置bg_color
     *
     * @param bgColor bg_color
     */
    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }
}