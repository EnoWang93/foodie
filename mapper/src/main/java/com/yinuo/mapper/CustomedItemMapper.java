package com.yinuo.mapper;


import com.yinuo.pojo.vo.ItemCommentsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CustomedItemMapper {
    List<ItemCommentsVO> queryItemComments(@Param("paramsMap") Map<String, Object> map);
}