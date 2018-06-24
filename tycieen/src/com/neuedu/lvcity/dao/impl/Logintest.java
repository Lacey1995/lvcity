package com.neuedu.lvcity.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.neuedu.lvcity.model.Users;
import com.neuedu.lvcity.service.UsersService;
import com.neuedu.lvcity.service.impl.UsersServiceImpl;

public class Logintest {

	@Test
	public void test() {
		UsersService usersService = UsersServiceImpl.getInstance();
		Users login = usersService.login("admin", "123");
		System.out.println(login.toString());
	}

}
