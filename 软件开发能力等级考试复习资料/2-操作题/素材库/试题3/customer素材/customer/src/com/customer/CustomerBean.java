package com.customer;

import java.sql.*;
import java.util.*;

public class CustomerBean {
	
	private static String driver;
	private static String url;
	private static String dbUser;
	private static String dbPassword;
	
	public CustomerBean() {
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

	public List<Customer> getCustomers(){
		
		List<Customer> list=new ArrayList();
		
		
		return list;
	}
	
}
