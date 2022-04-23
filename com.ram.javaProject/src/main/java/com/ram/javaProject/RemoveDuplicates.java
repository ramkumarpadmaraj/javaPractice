package com.ram.javaProject;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		char[] input= {'a','b','a','c','b','a','d','e','e','d','f'};
		int outputLength=removeDuplicates(input);
		
		for(int i=0;i<=outputLength;i++)
			System.out.print(input[i]);

	}
	public static int removeDuplicates(char[] input)
	{
		Arrays.sort(input);
		System.out.println(input);
		int newLength=0;
		for(int i=0;i<input.length-1;i++)
		{
			if(input[i]!=input[i+1])
			{
				input[newLength]=input[i];
				newLength++;
			}
			if(input[i+1]!=input[i])
				input[newLength]=input[i+1];
						
		}
			
		return newLength;
}
}
