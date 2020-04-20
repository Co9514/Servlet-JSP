package com.edu.test;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
		@SuppressWarnings("finally")
		public static Connection createConn(String DatabaseName, String userId,String userPassword)
		{
			String url = "jdbc:mysql://220.69.74.168:3306/"+DatabaseName+"?useSSL=false";
			Connection conn = null;
			try {
			conn=DriverManager.getConnection(url,userId,userPassword);
			System.out.println("연결 성공");
			}
			catch (Exception e) {
				System.out.println("연결 실패"+e);
			}finally {
				return conn;
			}
		}
	}