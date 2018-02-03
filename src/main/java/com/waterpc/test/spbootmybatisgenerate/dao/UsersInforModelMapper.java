package com.waterpc.test.spbootmybatisgenerate.dao;

import org.apache.ibatis.annotations.Mapper;

import com.waterpc.test.spbootmybatisgenerate.entity.UsersInforEntity;

//@Mapper
public interface UsersInforModelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UsersInforEntity record);

    int insertSelective(UsersInforEntity record);

    UsersInforEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UsersInforEntity record);

    int updateByPrimaryKey(UsersInforEntity record);
}