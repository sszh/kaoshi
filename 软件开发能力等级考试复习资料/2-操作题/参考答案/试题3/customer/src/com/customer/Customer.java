package com.customer;

public class Customer {
	
	private int id;
	private String name;
	private String telephone;
	private String email;
	private String cdate;
	
	public Customer(int id, String name, String telephone, String email,
			String cdate) {
		super();
		this.id = id;
		this.name = name;
		this.telephone = telephone;
		this.email = email;
		this.cdate = cdate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
}
