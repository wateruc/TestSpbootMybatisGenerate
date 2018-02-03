package com.waterpc.test.spbootmybatisgenerate.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.waterpc.test.spbootmybatisgenerate.service.UsersInforService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/usersinfor")
public class UsersInforController {

	@Autowired
	private UsersInforService usersInforService;
	
	@ApiOperation(value="获取一个用户的详细信息", notes="根据url的id来获取用户详细信息")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "long", paramType = "path")
	@RequestMapping(value = "/getone/{id}", method = RequestMethod.GET)
	public Map<String, Object> getOneUserInfor(@PathVariable("id") long id) {
		Map<String, Object> returnReslt = new HashMap<>();
		try {
			returnReslt.put("result", usersInforService.getOneUserInfor(id));
			returnReslt.put("status", "success");
		} catch (Exception e) {
			returnReslt.put("msg", e.getMessage());
			returnReslt.put("status", "failed");
		}
		return returnReslt;
	}

}
