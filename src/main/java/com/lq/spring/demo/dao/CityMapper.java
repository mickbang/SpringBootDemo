package com.lq.spring.demo.dao;

import com.lq.spring.demo.model.City;
import org.springframework.stereotype.Component;

@Component
public interface CityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}