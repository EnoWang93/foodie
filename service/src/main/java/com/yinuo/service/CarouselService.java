package com.yinuo.service;

import com.yinuo.pojo.Carousel;

import java.util.List;

public interface CarouselService {
    List<Carousel> findAllCarousel(int isVisible);
}
