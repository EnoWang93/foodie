package com.yinuo.mapper;

import com.yinuo.pojo.vo.CategoryVO;

import java.util.List;

public interface CustomedCategoryMapper {
    List<CategoryVO> getSubCategories(int rootId);
}