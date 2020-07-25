package com.yinuo.controller;

import com.yinuo.common.RestReturnJson;
import com.yinuo.pojo.Item;
import com.yinuo.pojo.ItemImg;
import com.yinuo.pojo.ItemParam;
import com.yinuo.pojo.ItemSpec;
import com.yinuo.pojo.vo.ItemInfoVO;
import com.yinuo.service.ItemService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/info/{itemId}")
    public RestReturnJson info(
            @PathVariable String itemId) {

        if (StringUtils.isBlank(itemId)) {
            return RestReturnJson.errorMsg(null);
        }

        Item item = itemService.queryItemById(itemId);
        List<ItemImg> itemImgList = itemService.queryItemImgList(itemId);
        List<ItemSpec> itemsSpecList = itemService.queryItemSpecList(itemId);
        ItemParam itemsParam = itemService.queryItemParam(itemId);

        ItemInfoVO itemInfoVO = new ItemInfoVO();
        itemInfoVO.setItem(item);
        itemInfoVO.setItemImgList(itemImgList);
        itemInfoVO.setItemSpecList(itemsSpecList);
        itemInfoVO.setItemParams(itemsParam);

        return RestReturnJson.ok(itemInfoVO);
    }
}
