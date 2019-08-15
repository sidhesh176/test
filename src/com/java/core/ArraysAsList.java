package com.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] namesArray = new String[] { "Yuvi", "Kishore", "Raghav" };
		List<Integer> values = Arrays.asList(1, 6, 8, 3, 6);
		values.forEach(i -> System.out.println(i));
		
		System.out.println();
		
		List<String> names = Arrays.asList("Yuvi", "Kishore", "Raghav");
		names.forEach(name -> System.out.println(name));
		
		System.out.println();
		
		Collections.sort(names);
		names.forEach(name -> System.out.println(name));

		System.out.println();
		List namesArrayList = Arrays.asList(namesArray);
		namesArrayList.forEach(n -> System.out.println(n));
	}

}
