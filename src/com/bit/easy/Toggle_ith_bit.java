package com.bit.easy;

public class Toggle_ith_bit {
	
	/* convert ith bit to its opposite bit 0 to 1 & 1 to 0 */

	public static void main(String[] args) {
		System.out.println(13);
	}
	
	public static int togleIthNo(int n , int i) {
		return n ^ (1 << i);
	}

}
