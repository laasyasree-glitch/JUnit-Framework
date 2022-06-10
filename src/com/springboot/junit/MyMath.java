package com.springboot.junit;

public class MyMath {
	
	public int sumCalculator(int[] numberList) {
		int sum = 0;
		for(int i : numberList) {
			sum+=i;
		}
		return sum;
	}
	
}
