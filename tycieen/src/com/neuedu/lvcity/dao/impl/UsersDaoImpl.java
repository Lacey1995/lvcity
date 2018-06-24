package com.neuedu.lvcity.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neuedu.lvcity.common.DBUtils;
import com.neuedu.lvcity.dao.UsersDao;
import com.neuedu.lvcity.model.Users;

public class UsersDaoImpl implements UsersDao {
	Connection conn =null;
	
	public UsersDaoImpl(Connection connection){
		
	this.conn=connection;
	}
	public Users login(String username, String password)
	  {
	    StringBuffer buff = new StringBuffer();
	    buff.append("SELECT * ");
	    buff.append("FROM users ");
	    buff.append("where name=? AND passwd= ? ");
	    
	    String find_sql = buff.toString();
	    
	    Users user = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    try
	    {
	      pstmt = this.conn.prepareStatement(find_sql);
	      pstmt.setString(1, username);
	      pstmt.setString(2, password);
	      
	      rs = pstmt.executeQuery();
	      if (rs.next())
	      {
	        user = new Users();
	        user.setId(rs.getInt("id"));
	        user.setName(rs.getString("name"));
	        user.setPasswd(rs.getString("passwd"));
	        user.setPhone(rs.getString("phone"));
	      }
	    }
	    catch (SQLException e)
	    {
	      e.printStackTrace();
	    }
		return user;
	  }
}

