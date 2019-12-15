package com.spring.model;

public class BankModel {

	private String name;
	private String address;
	private String ifcCode;

	public BankModel(String name, String address, String ifcCode) {
		super();
		this.name = name;
		this.address = address;
		this.ifcCode = ifcCode;
	}

	public BankModel() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIfcCode() {
		return ifcCode;
	}

	public void setIfcCode(String ifcCode) {
		this.ifcCode = ifcCode;
	}

}
