package com.citi;

public class StudentMedical extends Student {

	private String medicalTraining;
	private String dept;

	public StudentMedical() {
		// TODO Auto-generated constructor stub
	}

	public StudentMedical(int id, String name, String phone, String add, String medicalTraining, String dept) {
		super(id, name, phone, add);
		this.medicalTraining = medicalTraining;
		this.dept = dept;
	}

	public String getMedicalTraining() {
		return medicalTraining;
	}

	public void setMedicalTraining(String medicalTraining) {
		this.medicalTraining = medicalTraining;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "StudentMedical [medicalTraining=" + medicalTraining + ", dept=" + dept + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getPhone_num()=" + getPhone_num() + ", getAddress()=" + getAddress()
				+ ", toString()=" + super.toString() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ "]";
	}

}
