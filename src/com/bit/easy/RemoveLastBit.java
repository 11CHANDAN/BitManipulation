package com.bit.easy;

public class RemoveLastBit {
	
	/* Remove the right most 1 and convert to 0 */

	public static void main(String[] args) {
		int n = 16;
		System.out.println(n & n-1);
		
		n=13;
		System.out.println(n & n-1);
	}

}
