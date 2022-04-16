package com.ram.javaProject;

import java.util.Scanner;

public class isPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked:");
		int input=sc.nextInt();
		sc.close();
		int temp=input;
		int remainder=0;
		while(input>0)
		{
			remainder=remainder*10+(input%10);
			input=input/10;
		}
		System.out.println(temp);
		if(temp==remainder)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		}

}
