package com.product.service;

import java.sql.*;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	private static String driver;
	private static String url;
	private static String dbUser;
	private static String dbPassword;
	
	public ProductService() {
		try{
			Properties prop = new Properties();
			prop.load(this.getClass().getResourceAsStream("db.properties"));
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			dbUser = prop.getProperty("username");
			dbPassword = prop.getProperty("password");			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public Product search(int id) {
		
		//...
		
		return null;
	}
}





