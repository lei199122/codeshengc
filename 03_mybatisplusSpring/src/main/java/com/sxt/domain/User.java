package com.sxt.domain;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_user")
public class User {
	//如果数据库字段名不一样用@TableId
	@TableId(value = "id" ,type = IdType.AUTO)
	private Integer id;
	@TableField(value = "name")
	private String name;
	@TableField(value = "address")
	private String address;
	@TableField(value = "birth")
	private Date birth;
}
