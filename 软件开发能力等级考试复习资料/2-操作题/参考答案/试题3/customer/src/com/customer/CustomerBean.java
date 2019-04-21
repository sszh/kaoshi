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
		
        try {
            Class.forName(driver);
            Connection cnn=DriverManager.getConnection(url,dbUser,dbPassword);

            PreparedStatement ps=cnn.prepareStatement("select * from customer"); 
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String telephone=rs.getString("telephone");
                String email=rs.getString("email");
                String cdate=rs.getString("createdate");
                list.add(new Customer(id, name, telephone, email, cdate));
            }
            
            rs.close();
            ps.close();
            cnn.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
		
		return list;
	}
	
	public static void main(String[] args) {
		List<Customer> list=new CustomerBean().getCustomers();
		for (Customer c : list) {
			System.out.println(c.getId()+" "+c.getName()+" "+c.getTelephone()
					+" "+c.getEmail()+" "+c.getCdate());
		}
	}
}
