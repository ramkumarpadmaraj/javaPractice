package com.ram.javaProject;

import java.util.regex.Pattern;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result= twosum("ram","kumar");
		System.out.println(result);
		
		/*
		 * int a=130; byte b=(byte)a; System.out.println(a); System.out.println(b);
		 */
		/*
		 * boolean flag=false; System.out.println(flag);
		 */
	//System.out.println(a++);
	/*
	 * //System.out.println(++a); int number=2; int a=20; int b=-15; boolean c=true;
	 * boolean d=false; System.out.println(~a);//-11 (minus of total positive value
	 * which starts from 0) System.out.println(~b);//9 (positive of total minus,
	 * positive starts from 0) System.out.println(!c);//false (opposite of boolean
	 * value) System.out.println(!d);//true
	 * 
	 * switch (number){
	 * 
	 * case 1: System.out.println("Number one"); break; case 2:
	 * System.out.println("Number two"); break; case 3:
	 * System.out.println("Number three"); } System.out.println(Math.sqrt(7));
	 */
	}

	private static int twosum(String num1, String num2) {
		// TODO Auto-generated method stu
		//StringBuilder sb1=new StringBuilder(num1);
		//StringBuffer sb2=new StringBuffer(num2);
		//num1.matches(num2)
		System.out.println(Pattern.matches("[0-10]+", "10"));
		System.out.println(Pattern.matches("[0-9]+", "250"));
		/*
		 * if(Pattern.matches("\\D+", num2)) num2="0"; //System.out.println(num2);
		 * 
		 * //System.out.println(num1); if(!Pattern.matches("\\d+", num1)) num1="0";
		 * System.out.println(num1);
		 */
		
		//if(!Pattern.matches("//d", num2)) num2="0";
		
		//System.out.println(num2);
		int number1=0;
		int number2=0;
		
		try {
			 number1=Integer.parseInt(num1);
		}
		catch(Exception E)
		{
			//E.printStackTrace();
		}
		try {
		number2=Integer.parseInt(num2);
		}
		catch(NumberFormatException E)
		{
			//E.printStackTrace();
		}
		
				
		return number1+number2;
	}

}
