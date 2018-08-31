package com.capgemini.domain;

public class CellPhone {
	public CellPhone() {
	}
	String company;
	String model;
	int description;
	String operatingSstem;
	double price;
	public CellPhone(String company, String model, int description, String operatingSstem, double price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSstem = operatingSstem;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getDescription() {
		return description;
	}
	public void setDescription(int description) {
		this.description = description;
	}
	public String getOperatingSstem() {
		return operatingSstem;
	}
	public void setOperatingSstem(String operatingSstem) {
		this.operatingSstem = operatingSstem;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
