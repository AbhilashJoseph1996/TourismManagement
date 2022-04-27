package com.abhi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {
@Id
private String hotelNo;
private String hotelName;
private String hotelType;
private String location;
private double rate;
public Hotel() {
	super();
	// TODO Auto-generated constructor stub
}
public Hotel(String hotelNo, String hotelName, String hotelType, String location, double rate) {
	super();
	this.hotelNo = hotelNo;
	this.hotelName = hotelName;
	this.hotelType = hotelType;
	this.location = location;
	this.rate = rate;
}
public String getHotelNo() {
	return hotelNo;
}
public void setHotelNo(String hotelNo) {
	this.hotelNo = hotelNo;
}
public String getHotelName() {
	return hotelName;
}
public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}
public String getHotelType() {
	return hotelType;
}
public void setHotelType(String hotelType) {
	this.hotelType = hotelType;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}
@Override
public String toString() {
	return "Hotel [hotelNo=" + hotelNo + ", hotelName=" + hotelName + ", hotelType=" + hotelType + ", location="
			+ location + ", rate=" + rate + "]";
}
}
