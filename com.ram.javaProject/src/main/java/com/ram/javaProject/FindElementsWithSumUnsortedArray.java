package com.ram.javaProject;

import java.util.HashSet;
import java.util.Set;

public class FindElementsWithSumUnsortedArray {
	
	public boolean isElementsWithSumPresent(int[] array1, int sum)
	{
		Set<Integer> comp=new HashSet<Integer>();
		for(int i=0; i<array1.length;i++)
		{
			if(comp.contains(array1[i]))
			return true;
			else
				comp.add(sum-array1[i]);
		}
			
		return false;
	}

}
