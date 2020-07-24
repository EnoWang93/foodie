package com.yinuo.pojo.vo;

import java.util.List;

public class CategoryVO {

    private Integer id;
    private String name;
    private String level;
    private Integer fatherId;

    private List<SubCategoryVO> subCatList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public List<SubCategoryVO> getSubCatList() {
        return subCatList;
    }

    public void setSubCatList(List<SubCategoryVO> subCatList) {
        this.subCatList = subCatList;
    }
}
