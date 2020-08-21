package com.todoapp.testJdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String url = "jdbc:mysql://localhost:3307/to_do?useSSL=false";
			String user= "todo";
			String password = "todo";
			
			try {
				System.out.println("Connection to db : " + url );
				Connection con = DriverManager.getConnection(url,user,password);
				System.out.println("Connection succeesful!!!");
			} catch (Exception e) {
			
				e.printStackTrace();
			}
	}

}
