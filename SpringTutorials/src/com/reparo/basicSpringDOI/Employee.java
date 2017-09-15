package com.reparo.basicSpringDOI;

public class Employee {

	private int eid;
	private String ename;
	private Address address;
	
	public Employee() {
		System.out.println("Employee Object Constructed!!!");
	}
	
	public Employee(Address address) {
		this.address = address;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eAddress=" + address + "]";
	}

}
