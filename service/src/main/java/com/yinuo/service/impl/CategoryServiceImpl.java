package com.yinuo.service.impl;

import com.yinuo.mapper.CustomedCategoryMapper;
import com.yinuo.pojo.Category;
import com.yinuo.pojo.vo.CategoryVO;
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

    @Autowired
    CustomedCategoryMapper customedCategoryMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Category> findAllRootCategories() {
        Example example = new Example(Category.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("level", 1);
        List<Category> categories = categoryMapper.selectByExample(example);
        return categories;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<CategoryVO> findAllSubCategories(int rootId) {
        return customedCategoryMapper.getSubCategories(rootId);
    }
}
