package com.ram.javaProject;

public class Pojo {
	int a=10;
Pojo()
{
	System.out.println("Parent class");
}
Pojo(int a)
{
	this.a=a;
	System.out.println(this.a);
}
}
