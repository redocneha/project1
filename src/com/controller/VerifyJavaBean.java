package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class VerifyJavaBean {

static boolean check(String name, String pwd) {
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Sapient123");
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select* from person");
	while(rs.next())
	{
	String nam1=rs.getString(1);
	String nam2=rs.getString(2);
	if(nam1.equals(name)&&nam2.equals(pwd)) {
		return true;
	
		
	}
	
	}
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	return false;
}
}
