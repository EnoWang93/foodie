package com.yinuo.service.impl;

import com.yinuo.pojo.Carousel;
import com.yinuo.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class CarouselServiceImpl implements CarouselService {

    @Autowired
    private CarouselMapper carouselMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Carousel> findAllCarousel(int isVisible) {
        Example example = new Example(Carousel.class);
        example.orderBy("orderNum").asc();
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("isVisible", isVisible);

        List<Carousel> carousels =  carouselMapper.selectByExample(example);

        return carousels;
    }
}
