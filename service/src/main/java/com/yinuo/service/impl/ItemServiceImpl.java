package com.yinuo.service.impl;


import com.yinuo.mapper.ItemImgMapper;
import com.yinuo.mapper.ItemMapper;
import com.yinuo.mapper.ItemParamMapper;
import com.yinuo.mapper.ItemSpecMapper;
import com.yinuo.pojo.Item;
import com.yinuo.pojo.ItemImg;
import com.yinuo.pojo.ItemParam;
import com.yinuo.pojo.ItemSpec;
import com.yinuo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemMapper itemMapper;

    @Autowired
    private ItemImgMapper itemImgMapper;
    @Autowired
    private ItemSpecMapper itemSpecMapper;
    @Autowired
    private ItemParamMapper itemParamMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Item queryItemById(String itemId) {
        return itemMapper.selectByPrimaryKey(itemId);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<ItemImg> queryItemImgList(String itemId) {
        Example itemsImgExp = new Example(ItemImg.class);
        Example.Criteria criteria = itemsImgExp.createCriteria();
        criteria.andEqualTo("itemId", itemId);

        return itemImgMapper.selectByExample(itemsImgExp);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<ItemSpec> queryItemSpecList(String itemId) {
        Example itemsSpecExp = new Example(ItemSpec.class);
        Example.Criteria criteria = itemsSpecExp.createCriteria();
        criteria.andEqualTo("itemId", itemId);

        return itemSpecMapper.selectByExample(itemsSpecExp);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ItemParam queryItemParam(String itemId) {
        Example itemsParamExp = new Example(ItemParam.class);
        Example.Criteria criteria = itemsParamExp.createCriteria();
        criteria.andEqualTo("itemId", itemId);

        return itemParamMapper.selectOneByExample(itemsParamExp);
    }
}
