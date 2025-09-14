package com.bit.easy;

public class NumberIsPowerOf2 {
	
	/* check if the number is power of 2 or not */

	public static void main(String[] args) {
		System.out.println(checkNumIsPowerOf2(10));
		System.out.println(checkNumIsPowerOf2(16));
		System.out.println(checkNumIsPowerOf2(18));
		System.out.println(checkNumIsPowerOf2(64));
	}
	
	public static boolean checkNumIsPowerOf2(int n) {
		if((n & n-1) == 0) {
			return true;
		}
		
		return false;
	}
}
