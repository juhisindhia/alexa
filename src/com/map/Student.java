package com.map;


public class Student {

	long mobileNo;
	String name;
	String address;
	
	
	public Student(long mobileNo, String name, String address) {
		super();
		this.mobileNo = mobileNo;
		this.name = name;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [mobileNo=" + mobileNo + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
