package com.neuedu.lvcity.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.neuedu.lvcity.model.Users;
import com.neuedu.lvcity.service.UsersService;

public class daa {

	@Test
	public void test() {
		UsersService usersService = UsersServiceImpl.getInstance();
		//返回值放在users对象
		Users users = usersService.login("admin","123");
		if (users == null) {
			System.out.println(users.toString());
		}
		else
			System.out.println(users.toString());
	}

}
