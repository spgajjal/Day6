package com.capgemini.domain;

public class Television {
	public Television() {
	}
	
		String company;
		String type;
		int enabled;
		double price;
		public Television(String company, String type, int enabled, double price) {
			super();
			this.company = company;
			this.type = type;
			this.enabled = enabled;
			this.price = price;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getEnabled() {
			return enabled;
		}
		public void setEnabled(int enabled) {
			this.enabled = enabled;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
	}


