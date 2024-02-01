package com.arya.aggregation.address;

public class Address {
	
	String city;
	int pincode;
	String landMark;
	boolean currentAddress;
	
	public Address() {
		super();
	}
	public Address(String city, int pincode, String landMark, boolean currentAddress) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.landMark = landMark;
		this.currentAddress = currentAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public boolean isCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(boolean currentAddress) {
		this.currentAddress = currentAddress;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + ", landMark=" + landMark + ", currentAddress="
				+ currentAddress + "]";
	}
	
	
	

}