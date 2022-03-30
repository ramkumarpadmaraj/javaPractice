package com.ram.javaProject;

import java.util.HashMap;

public class Application {

	public static void main(String[] args) {

		/*
		 * FindElementsWithSumUnsortedArray fs=new FindElementsWithSumUnsortedArray();
		 * 
		 * int[] array= {6, 3,7,1}; int sum=8; boolean
		 * bool=fs.isElementsWithSumPresent(array, sum); System.out.println(bool);
		 */

		/*
		 * FindMatchInAnotherArray fm=new FindMatchInAnotherArray(); char[] array1=
		 * {'a','b','c','f'}; char[] array2= {'d','e','k','g'}; boolean
		 * bool=fm.isMatchFound(array1, array2); System.out.println(bool);
		 */

		/*
		 * FindElementsWithSumSortedArray fs=new FindElementsWithSumSortedArray(); int[]
		 * array= {1,2,4,5}; int sum=8; boolean bool=fs.isElementsWithSumPresent(array,
		 * sum); System.out.println(bool);
		 */

		
		  FindOccurrence fo=new FindOccurrence(); HashMap<Character,Integer>
		  hm=fo.findOccurence("good afternoon"); System.out.println(hm.toString());
		 

		/*
		 * FindOccurrenceOfChar foc=new FindOccurrenceOfChar(); String
		 * str="This is a program to find the number of occurrences of a character in a given string"
		 * ;
		 * 
		 * System.out.println(foc.findOccurenceOfChar(str, 'x'));
		 */
	}

}
