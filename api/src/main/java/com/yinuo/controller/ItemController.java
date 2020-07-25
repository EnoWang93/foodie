package com.yinuo.controller;

import com.yinuo.common.PagedGridResult;
import com.yinuo.common.RestReturnJson;
import com.yinuo.pojo.Item;
import com.yinuo.pojo.ItemImg;
import com.yinuo.pojo.ItemParam;
import com.yinuo.pojo.ItemSpec;
import com.yinuo.pojo.vo.CommentLevelCountsVO;
import com.yinuo.pojo.vo.ItemInfoVO;
import com.yinuo.service.ItemService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("items")
public class ItemController  extends BaseController{

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

    @GetMapping("/commentLevel")
    public RestReturnJson commentLevel(
            @RequestParam String itemId) {

        if (StringUtils.isBlank(itemId)) {
            return RestReturnJson.errorMsg(null);
        }

        CommentLevelCountsVO countsVO = itemService.queryCommentCounts(itemId);

        return RestReturnJson.ok(countsVO);
    }

    @GetMapping("/comments")
    public RestReturnJson comments(
            @RequestParam String itemId,
            @RequestParam Integer level,
            @RequestParam Integer page,
            @RequestParam Integer pageSize) {

        if (StringUtils.isBlank(itemId)) {
            return RestReturnJson.errorMsg(null);
        }

        if (page == null) {
            page = 1;
        }

        if (pageSize == null) {
            pageSize = COMMON_PAGE_SIZE;
        }

        PagedGridResult grid = itemService.queryPagedComments(itemId,
                level,
                page,
                pageSize);

        return RestReturnJson.ok(grid);
    }

    @GetMapping("/search")
    public RestReturnJson search(
            @RequestParam String keywords,
            @RequestParam String sort,
            @RequestParam Integer page,
            @RequestParam Integer pageSize) {

        if (StringUtils.isBlank(keywords)) {
            return RestReturnJson.errorMsg(null);
        }

        if (page == null) {
            page = 1;
        }

        if (pageSize == null) {
            pageSize = PAGE_SIZE;
        }

        PagedGridResult grid = itemService.searchItems(keywords,
                sort,
                page,
                pageSize);

        return RestReturnJson.ok(grid);
    }

    @GetMapping("/catItems")
    public RestReturnJson catItems(
            @RequestParam Integer catId,
            @RequestParam String sort,
            @RequestParam Integer page,
            @RequestParam Integer pageSize) {

        if (catId == null) {
            return RestReturnJson.errorMsg(null);
        }

        if (page == null) {
            page = 1;
        }

        if (pageSize == null) {
            pageSize = PAGE_SIZE;
        }

        PagedGridResult grid = itemService.searchItems(catId,
                sort,
                page,
                pageSize);

        return RestReturnJson.ok(grid);
    }

}
