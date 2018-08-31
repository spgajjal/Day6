package com.capgemini.domain;

public class CellPhone1 {

String company;
String model;
int description;
String operatingSstem;
double price;
public CellPhone1(String company, String model, int description, String operatingSstem, double price) {
	super();
	this.company = company;
	this.model = model;
	this.description = description;
	this.operatingSstem = operatingSstem;
	this.price = price;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((company == null) ? 0 : company.hashCode());
	result = prime * result + description;
	result = prime * result + ((model == null) ? 0 : model.hashCode());
	result = prime * result + ((operatingSstem == null) ? 0 : operatingSstem.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CellPhone1 other = (CellPhone1) obj;
	if (company == null) {
		if (other.company != null)
			return false;
	} else if (!company.equals(other.company))
		return false;
	if (description != other.description)
		return false;
	if (model == null) {
		if (other.model != null)
			return false;
	} else if (!model.equals(other.model))
		return false;
	if (operatingSstem == null) {
		if (other.operatingSstem != null)
			return false;
	} else if (!operatingSstem.equals(other.operatingSstem))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	return true;
}


}
