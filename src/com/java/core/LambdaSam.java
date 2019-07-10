package com.java.core;

import java.util.ArrayList;
import java.util.List;

public class LambdaSam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Why use Lambda Expression ========================= 1. To provide the
		 * implementation of Functional interface 2. Less coding
		 */

		// (argument-list) -> {body}
		// 1) Argument-list: It can be empty or non-empty as well.
		// 2) Arrow-token: It is used to link arguments-list and body of expression.
		// 3) Body: It contains expressions and statements for lambda expression.
		System.out.println("Lambda Expressions Sample");

		LambdaEmployee emp1 = new LambdaEmployee(1, "yuvi", "SA");
		LambdaEmployee emp2 = new LambdaEmployee(2, "nivaan", "A");
		LambdaEmployee emp3 = new LambdaEmployee(3, "sankari", "M");

		List<LambdaEmployee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		System.out.println(" \n\n Before  Lambda Sorting \n\n");
		empList.forEach(emp -> System.out.println(emp.getName()));
		
		//Descending Order Sorting
		// Implementing Comparator - functional interface compare method using Lambda
		empList.sort((LambdaEmployee le1, LambdaEmployee le2)-> le2.getName().compareTo(le1.getName()) );
		System.out.println(" \n\nAfter Lambda Sorting \n\n");
		// After Lambda Sorting 
		empList.forEach(emp -> System.out.println(emp.getName()));
	}

}
