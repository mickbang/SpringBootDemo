package com.lq.spring.demo.controller;

import com.lq.spring.demo.model.City;
import com.lq.spring.demo.dao.CityMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mick
 * @date 2019/4/2
 * <p>
 * Description
 */
@RestController
class CityController {
    @Autowired
    CityMapper mCityMapper;
    @RequestMapping("/selectCity")
    public City getCity(){
       City city =  mCityMapper.selectByPrimaryKey(Integer.valueOf(10));
       return city;
    }
}
