package com.reparo.basicSpringApp_init_destroy_interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {

	private int eid;
	private String ename;
	private String eaddress;

	public Employee() {
		System.out.println("Employee Object Constructed!!!");
	}

	public Employee(int eid, String ename, String eaddress) {
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
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

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eAddress=" + eaddress + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method");
	}

}
