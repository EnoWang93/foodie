package com.yinuo.mapper;

import com.yinuo.pojo.vo.CategoryVO;
import com.yinuo.pojo.vo.NewItemsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CustomedCategoryMapper {
    List<CategoryVO> getSubCategories(int rootId);

    List<NewItemsVO> getNewItems(@Param("paramsMap") Map<String, Integer> map);
}