package com.java.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorSam {

	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(99, "yuvi", "avinashi"));
		ar.add(new Student(56, "raghav", "tup"));
		ar.add(new Student(35, "ravi", "naduvachery"));

		System.out.println("Unsorted");
		ar.forEach(s -> System.out.println(s));

		//Collections.sort(ar, new Sortbyroll());

		ar.sort(new Sortbyroll());
		
		System.out.println("\nSorted by rollno");
		ar.forEach(s -> System.out.println(s));

		Collections.sort(ar, new Sortbyname());

		System.out.println("\nSorted by name");
		ar.forEach(s -> System.out.println(s));

		System.out.println("\nSorted by rollno Descending- using Lambda");
		ar.sort((Student s1, Student s2) -> s2.rollno - s1.rollno);
		ar.forEach(s -> System.out.println(s));
		
		ar.sort(new SortByAddress());
		System.out.println("\nSorted by Address");
		ar.forEach(s -> System.out.println(s));
	}

}

class Student {
	int rollno;
	String name, address;

	// Constructor
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details in main()
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
}

class Sortbyroll implements Comparator<Student> {
	// Used for sorting in ascending order of
	// roll number
	public int compare(Student a, Student b) {
		return a.rollno - b.rollno;
	}
}

class Sortbyname implements Comparator<Student> {
	// Used for sorting in ascending order of
	// roll name
	public int compare(Student a, Student b) {
		return a.name.compareTo(b.name);
	}

}

class SortByAddress implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.address.compareTo(s2.address);
	}
	
}