package com.yinuo.service.impl;


import com.yinuo.common.DesensitizationUtil;
import com.yinuo.common.PagedGridResult;
import com.yinuo.common.enums.CommentLevel;
import com.yinuo.mapper.*;
import com.yinuo.pojo.*;
import com.yinuo.pojo.vo.CommentLevelCountsVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yinuo.pojo.vo.ItemCommentsVO;
import com.yinuo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Autowired
    private ItemCommentsMapper itemCommentsMapper;

    @Autowired
    private CustomedItemMapper customedItemMapper;

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

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public CommentLevelCountsVO queryCommentCounts(String itemId) {
        Integer goodCounts = getCommentCounts(itemId, CommentLevel.GOOD.type);
        Integer normalCounts = getCommentCounts(itemId, CommentLevel.NORMAL.type);
        Integer badCounts = getCommentCounts(itemId, CommentLevel.BAD.type);
        Integer totalCounts = goodCounts + normalCounts + badCounts;

        CommentLevelCountsVO countsVO = new CommentLevelCountsVO();
        countsVO.setTotalCounts(totalCounts);
        countsVO.setGoodCounts(goodCounts);
        countsVO.setNormalCounts(normalCounts);
        countsVO.setBadCounts(badCounts);

        return countsVO;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    Integer getCommentCounts(String itemId, Integer level) {
        ItemComments condition = new ItemComments();
        condition.setItemId(itemId);
        if (level != null) {
            condition.setCommentLevel(level);
        }
        return itemCommentsMapper.selectCount(condition);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public PagedGridResult queryPagedComments(String itemId, Integer level,
                                              Integer currentPage, Integer pageSize) {
        Map<String, Object> map = new HashMap<>();
        map.put("itemId", itemId);
        map.put("level", level);
        PageHelper.startPage(currentPage, pageSize);

        List<ItemCommentsVO> list = customedItemMapper.queryItemComments(map);
        for (ItemCommentsVO vo : list) {
            vo.setNickname(DesensitizationUtil.commonDisplay(vo.getNickname()));
        }

        return setterPagedGrid(list, currentPage);
    }

    private PagedGridResult setterPagedGrid(List<?> list, Integer page) {
        PageInfo<?> pageList = new PageInfo<>(list);
        PagedGridResult grid = new PagedGridResult();
        grid.setPage(page);
        grid.setRows(list);
        grid.setTotal(pageList.getPages());
        grid.setRecords(pageList.getTotal());
        return grid;
    }
}
