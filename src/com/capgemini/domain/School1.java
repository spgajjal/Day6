package com.capgemini.domain;

import java.util.Objects;

public class School1 {
	
	String name;
	String city;
	int schoolDistrict;
	int greatSchoolRanking;
	
public School1() {
		
	}

public School1(String name, String city, int schoolDistrict, int greatSchoolRanking) {
	super();
	this.name = name;
	this.city = city;
	this.schoolDistrict = schoolDistrict;
	this.greatSchoolRanking = greatSchoolRanking;
}
@Override
public int hashCode() {
	
	return Objects.hash(name,schoolDistrict);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (this.getClass() != obj.getClass())
		return false;
	School1 other = (School1) obj;
	return this.name==other.name && this.schoolDistrict==other.schoolDistrict;
}


}
