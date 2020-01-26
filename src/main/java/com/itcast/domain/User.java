package com.itcast.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {


	private String username;

	private int id;

	private Date birthday;

	private String sex;

	private String address;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", id=" + id +
				", birthday=" + birthday +
				", sex='" + sex + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
