package com.ram.javaProject;

import java.util.ArrayList;

public class FindPrimes {

	public ArrayList<Long> findPrimeNumbers(int range) {
		
		ArrayList<Long> primes=new ArrayList<Long>();
		
		long num=2;
		//int primeCount=0;
		int count=0;
		while(num<=range)
		{
			
		for(long i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		if(count==2) {
				primes.add(num);
		}
		count=0;
		num++;
		}
		
		return primes;
		
	}
}
