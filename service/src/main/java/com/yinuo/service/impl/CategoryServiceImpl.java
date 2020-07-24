package com.yinuo.service.impl;

import com.yinuo.mapper.CategoryMapper;
import com.yinuo.pojo.Carousel;
import com.yinuo.pojo.Category;
import com.yinuo.pojo.User;
import com.yinuo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Category> findAllRootCategories() {
        Example example = new Example(Category.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("level", 1);
        List<Category> categories = categoryMapper.selectByExample(example);
        return categories;
    }
}
