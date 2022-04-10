package com.ram.javaProject;

public class ChildClass extends Pojo {

	String str= "ramkumar";
	
	

	ChildClass() {
		System.out.println("Child Class");
		System.out.println(a);
		System.out.println(str.indent(a));
		
	}

	ChildClass(int a) {
		super.a = a;
		
	}

}
