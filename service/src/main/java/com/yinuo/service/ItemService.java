package com.yinuo.service;

import com.yinuo.common.PagedGridResult;
import com.yinuo.pojo.*;
import com.yinuo.pojo.vo.CommentLevelCountsVO;

import java.util.List;

public interface ItemService {
    Item queryItemById(String itemId);

    List<ItemImg> queryItemImgList(String itemId);

    List<ItemSpec> queryItemSpecList(String itemId);

    ItemParam queryItemParam(String itemId);

    CommentLevelCountsVO queryCommentCounts(String itemId);

    public PagedGridResult queryPagedComments(String itemId, Integer level,
                                              Integer currentPage, Integer pageSize);

}
