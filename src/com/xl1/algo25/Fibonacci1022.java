package com.xl1.algo25;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci1022 {
	
	static List<Integer> suite = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fibonacci(7);
		System.out.println(findFibonacci(22, 10));

	}
	public static int fibonacci(Integer n) {
		if(n==0 || n==1) {
			suite.add(1);
			return 1;
		}else{
		 return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	
	static List<Integer> findFibonacci(int a, int b) {
		int max = a>b? a:b;
		int min = a<b? a:b;
		
		List<Integer> list = new ArrayList<>();
		
		int n = 0;
		
		while (fibonacci(n) < max) {
			if(fibonacci(n) > min) {
				list.add(fibonacci(n));
			}
			n++;
			
		}
		return list;
	}

}
