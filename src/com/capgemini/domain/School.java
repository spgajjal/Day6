package com.capgemini.domain;

public class School {
	public School() {
		
	}
String name;
String city;
int schoolDistrict;
int greatSchoolRanking;
public School(String name, String city, int schoolDistrict, int greatSchoolRanking) {
	super();
	this.name = name;
	this.city = city;
	this.schoolDistrict = schoolDistrict;
	this.greatSchoolRanking = greatSchoolRanking;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getSchoolDistrict() {
	return schoolDistrict;
}
public void setSchoolDistrict(int schoolDistrict) {
	this.schoolDistrict = schoolDistrict;
}
public int getGreatSchoolRanking() {
	return greatSchoolRanking;
}
public void setGreatSchoolRanking(int greatSchoolRanking) {
	this.greatSchoolRanking = greatSchoolRanking;
}
@Override
public String toString() {
	return "School [name=" + name + ", city=" + city + ", schoolDistrict=" + schoolDistrict + ", greatSchoolRanking="
			+ greatSchoolRanking + "]";
}


}
