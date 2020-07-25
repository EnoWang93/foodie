package com.yinuo.controller;

import com.yinuo.common.RestReturnJson;
import com.yinuo.common.enums.BINARY;
import com.yinuo.pojo.Carousel;
import com.yinuo.pojo.Category;
import com.yinuo.pojo.vo.CategoryVO;
import com.yinuo.pojo.vo.NewItemsVO;
import com.yinuo.service.CarouselService;
import com.yinuo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("homepage")
public class HomepageController {

    @Autowired
    CarouselService carouselService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("/carousels")
    public RestReturnJson getCarousels(){
        List<Carousel> list = carouselService.findAllCarousel(BINARY.YES.type);
        return RestReturnJson.ok(list);
    }

    @GetMapping("/categories")
    public RestReturnJson getRootCategories(){
        List<Category> list = categoryService.findAllRootCategories();
        return RestReturnJson.ok(list);
    }

    @GetMapping("/subCategory/{rootCatId}")
    public RestReturnJson getSubCategories(@PathVariable Integer rootCatId){
        if (rootCatId == null) {
            return RestReturnJson.errorMsg("wrong category");
        }
        List<CategoryVO> list = categoryService.findAllSubCategories(rootCatId);
        return RestReturnJson.ok(list);
    }

    @GetMapping("/newItems/{rootCatId}")
    public RestReturnJson getNewItems(@PathVariable Integer rootCatId){
        if (rootCatId == null) {
            return RestReturnJson.errorMsg("wrong category");
        }
        List<NewItemsVO> list = categoryService.getNewItems(rootCatId);
        return RestReturnJson.ok(list);
    }
}
