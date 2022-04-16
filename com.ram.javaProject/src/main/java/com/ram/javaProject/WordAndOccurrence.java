package com.ram.javaProject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class WordAndOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Harry Potter is an orphaned boy brought up by his unkind the Muggle (non-magical) aunt and uncle. At the age of eleven, half-giant Rubeus Hagrid informs him that he is actually a wizard and that his parents were murdered by an evil wizard named Lord Voldemort. Voldemort also attempted to kill one-year-old Harry on the same night, but his killing curse mysteriously rebounded and reduced him to a weak and helpless form. Harry became extremely famous in the Wizarding World as a result. Harry begins his first year at Hogwarts School of Witchcraft and Wizardry and learns about magic. During the year, Harry and his friends Ron Weasley and Hermione Granger become entangled in the mystery of the Philosopher's Stone which is being kept within the school.";
		/*
		 * String str1=str.replace(".", ""); System.out.println(str1);
		 */
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		int maxCount=0;
		//String maxOccurence="";
		String[] stringArray=str.replace(".", "").split(" ");
		
		for(int i=0;i<stringArray.length;i++)
		{
			if(hm.containsKey(stringArray[i]))
				hm.put(stringArray[i], hm.get(stringArray[i])+1);
			else
				hm.put(stringArray[i], 1);
		}
	
		System.out.println("Word : Number of Occurences");
		for(String key:hm.keySet())
		{
			if(hm.get(key)>=maxCount)
			{
				maxCount=hm.get(key);
				//maxOccurence=key;		
		}
			//
		}
		
		for(String key:hm.keySet())
		{
			if(hm.get(key)==maxCount)
				System.out.println(key+ " : "+hm.get(key));	
		}
	
	}

}
