package com.ram.javaProject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindOccurrence {

	private HashMap<Character, Integer> occurence = new HashMap<Character, Integer>();

	public HashMap<Character,Integer> findOccurence(String str)
	{
		char [] ch= str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(occurence.containsKey(ch[i]))
			{
			int temp=occurence.get(ch[i])+1;
			occurence.put(ch[i], temp);
			}
			else
				occurence.put(ch[i], 1);
			}
						
		
/*		Iterator<Map.Entry<Character, Integer> > iterator = occurence.entrySet().iterator();
		Integer valueToBeRemoved=1;
    // Iterate over the HashMap
    while (iterator.hasNext()) {

        // Get the entry at this iteration
        Map.Entry<Character, Integer> entry = iterator.next();

        // Check if this value is the required value
        if (valueToBeRemoved.equals(entry.getValue())) {

            // Remove this entry from HashMap
            iterator.remove();
        }*/
		
		for(Character Key: occurence.keySet())
			if(occurence.get(Key)>1)
			System.out.println(Key+":" +occurence.get(Key));
    

	return occurence;
	}
	
}
