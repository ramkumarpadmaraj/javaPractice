

package com.ram.javaProject;

import java.util.HashSet;

public class FindMatchInAnotherArray {
	public boolean isMatchFound(char[] array1, char[] array2)
	{
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<array1.length;i++)
		{
			if(!hs.contains(array1[i]))
				
			hs.add(array1[i]);
			
		}
		
		for(int j=0;j<array2.length;j++)
		{
			if(hs.contains(array2[j]))
				return true;
								
		}
		
		return false;
	}

}