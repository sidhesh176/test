package com.java.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachSam {

	public static void main(String[] args) {
		System.out.println("ForEach Example");
		List<Integer> numbersList = new ArrayList<>();

		numbersList.add(1);
		numbersList.add(2);
		numbersList.add(3);
		numbersList.add(8);

		/*
		 * int numbersArray[] = new int[] { 1,4,7,2,90,78,45}; List<int[]> numbersList =
		 * Arrays.asList(numbersArray);
		 */

		// Old Iterator
		System.out.println("Iterating List Values By Iterator \n");
		Iterator itr = numbersList.iterator();
		while (itr.hasNext())
			System.out.print(itr.next() + " , ");

		// For Each
		System.out.println("\n\nIterating List Values By For Each \n");
		numbersList.forEach(i -> printNumber(i));

		/*
		 * * @param action The action to be performed for each element
		 * 
		 * @throws NullPointerException if the specified action is null
		 * 
		 * @since 1.8
		 */
		/*
		 * default void forEach(Consumer<? super T> action) {
		 * Objects.requireNonNull(action); for (T t : this) { action.accept(t); }
		 */
	}

	public static void printNumber(int element) {
		System.out.println(" # " + element);
	}
}
