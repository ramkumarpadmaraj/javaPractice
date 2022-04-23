package com.ram.javaProject;

import java.util.Stack;

public class Brackets {

	public boolean isValid(String s) {
	    if (s == null) return false;
	    Stack<Character> stack = new Stack<Character>();      
	    int len =s.length();
	    
	    //if length of the string is not even, then we can return false as we do not have pairs
	    if(len%2!=0)
	    	return false;
	    //if the first character is one of the closing brace, we can return false
	    if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']')
	    	return false;
	
	   //if the character is closing brace, check the top of the stack has opening brace. if the character is opening brace, add to stack
	    for (int i  = 0 ; i < len ; i++ ){
	        
	        switch (s.charAt(i)){
	        case ')':
	                if (stack.isEmpty() || stack.pop() != '('){ return false;}
	                break;
	        case '}':
	                if (stack.isEmpty() || stack.pop() != '{'){ return false;}
	                break;
	        case ']':
	                if (stack.isEmpty() || stack.pop() != '['){ return false;}
	                break;
	        default:
	                stack.add(s.charAt(i)); 
	                break;
	            
	        }
	    }  
	    //check if stack is empty
	    if(stack.isEmpty())
	    	return true;
	    			
	    return  false;  
	    
	}
}
