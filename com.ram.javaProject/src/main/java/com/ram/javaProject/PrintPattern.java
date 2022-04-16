package com.ram.javaProject;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		int numberOfLines=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=numberOfLines;++i) {
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
				}
		for(int i=numberOfLines-1;i>=0;--i) {
			for(int j=1;j<=i;j++)
				System.out.print("*");
		System.out.println();

	}
	}
}
