package com.sxt;



import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
		IPage<User> page = new Page<>(1, 3);
		userMapper.selectPage(page, null);
		long total = page.getTotal();
		List<User> list = page.getRecords();
		for (User user : list) {
			System.out.println("对象"+user);
		
		}
		System.out.println("总条数" + total);
	}
	
	@Test
	public void  query () {
		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		//大于Id 9 的
		//queryWrapper.gt("id", 9);
		queryWrapper.like("name","使" );
		List<Map<String,Object>> selectMaps = userMapper.selectMaps(queryWrapper);
		System.out.print(selectMaps);
	}
}
