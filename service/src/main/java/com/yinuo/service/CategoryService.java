package com.yinuo.service;

import com.yinuo.pojo.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAllRootCategories();
}
