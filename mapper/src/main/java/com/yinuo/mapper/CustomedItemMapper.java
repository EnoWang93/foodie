package com.yinuo.mapper;


import com.yinuo.pojo.vo.ItemCommentsVO;
import com.yinuo.pojo.vo.SearchItemsVO;
import com.yinuo.pojo.vo.ShoppingCartVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CustomedItemMapper {
    List<ItemCommentsVO> queryItemComments(@Param("paramsMap") Map<String, Object> map);

    List<SearchItemsVO> searchItems(@Param("paramsMap") Map<String, Object> map);

    List<SearchItemsVO> searchItemsByThirdCat(@Param("paramsMap") Map<String, Object> map);

    List<ShoppingCartVO> queryItemsBySpecIds(@Param("paramsList") List specIdsList);
}