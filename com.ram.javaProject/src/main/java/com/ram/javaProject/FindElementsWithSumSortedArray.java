package com.ram.javaProject;

public class FindElementsWithSumSortedArray {
	
	public boolean isElementsWithSumPresent(int[] array1, int sum)
	{
		int i=0;
		int j=array1.length-1;
		while(i<j)
		{
		int total=array1[i]+array1[j];
		if(total==sum)
			return true;
		else if(total>sum)
			j--;
		else
			i++;
		}
				
		return false;
	}

}
