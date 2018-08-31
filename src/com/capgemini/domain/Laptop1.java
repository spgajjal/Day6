package com.capgemini.domain;

import java.util.Objects;

public class Laptop1 {
	String company;
	String model;
	String operatingSystem;
	 String processor;
	public Laptop1(String company, String model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(model,company);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop1 other = (Laptop1) obj;
		return this.model==other.model && this.company==other.company;
	}

}
