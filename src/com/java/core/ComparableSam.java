package com.java.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentTest> ar = new ArrayList<>();
		ar.add(new StudentTest(11, "yuvi", "rayampalayam"));
		ar.add(new StudentTest(2, "nivaan", "anthiyur"));
		ar.add(new StudentTest(3, "raghav", "periyarColony"));

		System.out.println("Before Sorting ");
		ar.forEach(student -> System.out.println(student));

		Collections.sort(ar);
		System.out.println("After  Sorting Using Comparable Interface - compareTo method");
		ar.forEach(student -> System.out.println(student));
	}

}

class StudentTest implements Comparable<StudentTest> {
	private int roll_no;
	private String name;
	private String address;

	public int getRoll_no() {
		return roll_no;
	}

	public StudentTest(int roll_no, String name, String address) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return roll_no + ", " + name + ",  " + address;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
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

	@Override
	public int compareTo(StudentTest s) {
		// return this.roll_no-s.roll_no;
		return s.name.compareTo(this.name);

	}

}