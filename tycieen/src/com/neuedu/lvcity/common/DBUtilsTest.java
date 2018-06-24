package com.neuedu.lvcity.common;

import java.sql.Connection;

import org.junit.Test;

public class DBUtilsTest {
	public void setUp() throws Exception{
		
	}
	@Test
	public void tetGetConnection(){
	System.out.println(DBUtils.getConnection());
		
	}
}
