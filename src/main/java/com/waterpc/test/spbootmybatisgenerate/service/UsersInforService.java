package com.waterpc.test.spbootmybatisgenerate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waterpc.test.spbootmybatisgenerate.dao.UsersInforModelMapper;
import com.waterpc.test.spbootmybatisgenerate.entity.UsersInforEntity;

@Service
public class UsersInforService {

	@Autowired
	private UsersInforModelMapper usersInforMapper;
	
	public UsersInforEntity getOneUserInfor(long id){
		return usersInforMapper.selectByPrimaryKey(id);
	}
	
}
