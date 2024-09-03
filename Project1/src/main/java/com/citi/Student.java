package com.citi;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private String phone_num;
	private String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String phone_num, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phone_num = phone_num;
		this.address = address;
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

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone_num=" + phone_num + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, id, name, phone_num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name)
				&& phone_num == other.phone_num;
	}

}