package com.sxt;


import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sxt.domain.User;
import com.sxt.mapper.UserMapper;

@SpringBootTest
class ApplicationTests {
	
	@Autowired
	public UserMapper userMapper;
	
	@Test
	void contextLoads() {
		System.out.println(userMapper.getClass());
	}
	
	/**
	 * 分页
	 */
	@Test
	public void query3() {
		IPage <User> page = new Page<>(1,3);
		userMapper.selectPage(page, null);
		long total = page.getTotal();
		List<User> list = page.getRecords();
		for (User user : list) {
			System.out.println(user);
		}
		System.out.println("总条数：" + total);
	}
	/**
	 * 查询返回集合
	 * @param userMapper
	 */
	@Test
	public void query2() {
		//List <Integer> idList = Arrays.asList(15,16,17,18,19);
		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		queryWrapper.gt("id", 1);
		queryWrapper.like("name", "明");
		List<Map<String,Object>> selectMap =userMapper.selectMaps(queryWrapper);
		System.out.println(selectMap);
		
	}
	/**
	 * 查询一个
	 * @param userMapper
	 */
	@Test
	public void query() {
		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("id", 9);
		User user = userMapper.selectOne(queryWrapper);
		System.out.println(user);
		}
	
	/**
	 * 删除
	 * @param userMapper
	 */
	@Test
	public void deleteUser() {
		UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
		updateWrapper.between("id", 10, 13);
		//userMapper.delete(updateWrapper);
		//根据主键删除
		//userMapper.deleteById(8);
	}
	/**
	 * 修改用户
	 * @param userMapper
	 */
	@Test
	public void updateUser() {
		User user = new User(0,"天使", "北京", new Date());
//		User user2 = new User();
//		user2.setId(16);
//		user2.setName("魔鬼");
//		user2.setAddress("杭州");
//		user2.setBirth(new Date());
//		userMapper.updateById(user2);
		UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
		updateWrapper.between("id", 15, 17);
		userMapper.update(user, updateWrapper);
		System.out.println("修改成功");
	}
	
	@Test
	public void insertUser() {
		userMapper.insert(new User(0, "小大华", "疙瘩村", new Date()));
		System.out.println("添加成功");
	}
}
