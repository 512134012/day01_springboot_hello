package com.jzl.day01_springboot_hello.mapper;

import com.jzl.day01_springboot_hello.entity.TUser;
import org.springframework.stereotype.Component;

@Component
public interface TUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}