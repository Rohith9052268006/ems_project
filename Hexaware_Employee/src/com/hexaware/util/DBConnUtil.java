package com.hexaware.util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
public class DBConnUtil {
	static Connection con;
	public static Connection getMyDBConnection() throws IOException {
		String fileName="db.properties";
		Properties properties=new Properties();
		FileInputStream fis=new FileInputStream(fileName);
		properties.load(fis);
		
		String url=properties.getProperty("db.url");
		String username=properties.getProperty("db.username");
		String password=properties.getProperty("db.password");
		
		try {
			con=DriverManager.getConnection(url,username,password);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) throws IOException {
		System.out.println(getMyDBConnection());
	}
}
