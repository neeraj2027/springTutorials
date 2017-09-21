package com.reparo.jdbc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", profession=" + profession + "]";
	}

	@Id
	int id;
	String name;
	String profession;

	public User() {
	}

	public User(int id, String name, String profession) {
		this.id = id;
		this.name = name;
		this.profession = profession;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}
