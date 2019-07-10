package com.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegisterBean {







	static boolean registerDone(String name, String pwd) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Sapient123");
		PreparedStatement stmt=con.prepareStatement("insert into person values(?,?)");
		stmt.setString(1,name);//1 specifies the first parameter in the query  
		stmt.setString(2,pwd); 
		stmt.execute();
		
		return true;
		}
		
		catch(Exception e)
		{
		System.out.println(e);
		}
		return false;
	}
	}


