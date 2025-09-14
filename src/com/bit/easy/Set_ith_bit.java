package com.bit.easy;

public class Set_ith_bit {
	
	/* If i th bit is 0 set that to 1 if it is already 1 don't do anything and convert it to decimal*/

	public static void main(String[] args) {
		System.out.println(set_ith_bit(9, 2));
	}
	
	public static int set_ith_bit(int n, int i) {
		return n & ~(1 << i);
	}

}
