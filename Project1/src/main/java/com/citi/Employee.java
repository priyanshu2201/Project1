package com.citi;

import java.util.Objects;

public class Employee {

	private String name;
	private int age;
	private String city;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, String city, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", city=" + city + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, city, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(city, other.city) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

}
