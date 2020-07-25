package com.yinuo.mapper;


import com.yinuo.pojo.vo.ItemCommentsVO;
import com.yinuo.pojo.vo.SearchItemsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CustomedItemMapper {
    List<ItemCommentsVO> queryItemComments(@Param("paramsMap") Map<String, Object> map);

    List<SearchItemsVO> searchItems(@Param("paramsMap") Map<String, Object> map);
}