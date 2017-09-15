package com.reparo.MessageSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import com.reparo.basicSpringDOIConstructor.Address;

public class Employee {

	private int eid;
	private String ename;
	private String eaddress;
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Employee() {
		System.out.println("Employee Object Constructed!!!");
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
	
	public void display() {
		System.out.println(getMessageSource().getMessage("helloEmployee", null, "No Message Configured", null));
		
		System.out.println(getMessageSource().getMessage("employeeInfo", new Object[] {eid,ename,eaddress}, "No Message Configured", null));
		
		
		
	}

}
