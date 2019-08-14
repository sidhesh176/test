package com.java.core;

public class LambdaEmployee {

	private int emp_id;
	private String name;
	private String grade;

	public LambdaEmployee(int emp_id, String name, String grade) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.grade = grade;
	}

	public int getEmp_id() {
		return emp_id;
	}

	@Override
	public String toString() {
		return "LambdaEmployee [emp_id=" + emp_id + ", name=" + name + ", grade=" + grade + "]";
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
