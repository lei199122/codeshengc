package com.sxt.controller;



import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sxt.dome.User;
import com.sxt.utils.ResultObj;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("user")
@Api(tags = "用户管理")
public class UserController {
	
	@GetMapping("hello")
	@ApiOperation(value = "接口",consumes = "测试",notes = "测试用")
	public ResultObj hello() {
		return new ResultObj(110, "接口文档测试");
	}
	
	
	@ApiOperation(value = "新增用户" , notes = "新增注册")
	@RequestMapping(value = "adduser",method = RequestMethod.POST)
	public ResultObj addUser(@RequestBody User user) {
		System.out.println("新增:"+ user.toString());
		return new ResultObj(HttpStatus.OK.value() , "新增成功");
	}
	
	@ApiOperation(value = "修改用户",notes = "修改用户")
	@RequestMapping(value = "updata",method = RequestMethod.POST)
	public ResultObj updataUser(@RequestBody User user) {
		System.out.println("修改完毕:" + user.toString());
		return new ResultObj(HttpStatus.OK.value(), "修改成功");
	}
	
	@ApiOperation(value = "删除用户",notes = "删除用户")
	@RequestMapping(value = "delete",method = RequestMethod.DELETE)
	@ApiImplicitParams({@ApiImplicitParam(name="userId",value = "用户标识",required = true,paramType = "字符串",dataType = "string")})
	public ResultObj deleteUser(@RequestParam("userId")String userId) {
		System.out.println("删除成功:" + userId);
		return new ResultObj(HttpStatus.OK.value(), "删除成功");
		
	}
	
	@ApiOperation(value = "查询用户",notes = "查询用户")
	@RequestMapping(value = "query" , method = RequestMethod.GET)
	@ApiImplicitParams({@ApiImplicitParam(name="userId",value = "用户标识",required = true ,paramType = "包装类型",dataType = "Integer")})
	public ResultObj queryUser(@RequestParam("userId")Integer userId) {
		System.out.println("查询成功"+ userId);
		User user  = new User(userId, "魔鬼", "上海", new Date());
		
		return new ResultObj(HttpStatus.OK.value(), user);
	}
}
