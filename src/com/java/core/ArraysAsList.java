package com.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(1, 6, 8, 3, 6);
		values.forEach(i -> System.out.println(i));
		
		List<String> names =  Arrays.asList("Yuvi","Kishore","Raghav");
		names.forEach(name -> System.out.println(name));
		
		Collections.sort(names);
		names.forEach(name -> System.out.println(name));
		
	}
	

}
