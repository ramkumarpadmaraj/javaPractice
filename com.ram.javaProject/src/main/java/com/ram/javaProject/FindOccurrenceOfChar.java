package com.ram.javaProject;

public class FindOccurrenceOfChar {

	public int findOccurenceOfChar(String str, char a)
	{
		int count=0;
		char[] ch=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]==a)
				count++;
		}
		
		return count;
	}
}
