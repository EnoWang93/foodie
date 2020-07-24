package com.yinuo.controller;

import com.yinuo.common.RestReturnJson;
import com.yinuo.common.enums.BINARY;
import com.yinuo.pojo.Carousel;
import com.yinuo.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("homepage")
public class HomepageController {

    @Autowired
    CarouselService carouselService;

    @GetMapping("/carousels")
    public RestReturnJson getCarousels(){
        List<Carousel> list = carouselService.findAllCarousel(BINARY.YES.type);
        return RestReturnJson.ok(list);
    }
}
