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
		
		Product p=new Product();
        try {
            Class.forName(driver);
            Connection cnn=DriverManager.getConnection(url,dbUser,dbPassword);

            PreparedStatement ps=cnn.prepareStatement("select * from product where id = ?"); 
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                int i=rs.getInt("id");
                String name=rs.getString("name");
                float price=rs.getFloat("price");
                p=new Product(id, name, price);
            }
            
            rs.close();
            ps.close();
            cnn.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
		
		return p;
	}
	
	public static void main(String[] args) {
		Product p=new ProductService().search(1);
		System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
	}
}





