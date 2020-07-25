package com.yinuo.service;

import com.yinuo.pojo.Category;
import com.yinuo.pojo.vo.CategoryVO;
import com.yinuo.pojo.vo.NewItemsVO;

import java.util.List;

public interface CategoryService {
    List<Category> findAllRootCategories();

    List<CategoryVO> findAllSubCategories(int rootId);

    public List<NewItemsVO> getNewItems(int rootCatId);
}
