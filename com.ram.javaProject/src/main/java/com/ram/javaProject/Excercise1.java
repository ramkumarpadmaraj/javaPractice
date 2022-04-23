package com.ram.javaProject;
import java.util.*;
public class Excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors=new ArrayList<String>();
		int count=0;
		int insertPosition=2;
		  colors.add("Red");
		  colors.add("Green");
		  colors.add("Yellow");
		  colors.add(0,"Blue");
		  colors.set(0, "Purple");
		  colors.add("Red");
		  colors.remove(2);
		 
		 if(colors.size()>insertPosition)
		  colors.add(insertPosition,"Orange");
		 // Collections.sort(colors,Collections.reverseOrder());
		 // Collections.swap(colors,0,3);
		 // System.out.println(colors.subList(count, insertPosition));
		 List<String> newColors=new ArrayList<String>();
		 newColors.addAll(colors);
		 System.out.println(colors.toString());
		  boolean flag=colors.contains("Red");
		  System.out.println(flag);
		Iterator<String> iterator=colors.iterator();
			
			  while(iterator.hasNext()) { count++; iterator.next();
			  
			  } System.out.println(count);
			  LinkedHashSet<String> hs=new LinkedHashSet<String>();
			  hs.addAll(colors);
			  System.out.println(hs.toString());
		  
	}

	
	
	
	
}
