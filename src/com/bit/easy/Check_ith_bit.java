package com.bit.easy;

public class Check_ith_bit {
	
	/*
	 * Given two integers n and i, return true if the ith bit in the binary
	 * representation of n (counting from the least significant bit, 0-indexed) is
	 * set (i.e., equal to 1). Otherwise, return false.
	 */

	public static void main(String[] args) {
		Check_ith_bit check_ith_bit = new Check_ith_bit();
		System.out.println(check_ith_bit.checkIthBitUsingLefttShift(13, 2));
		System.out.println(check_ith_bit.checkIthBitUsingRightShift(13, 1));
	}
	
	public boolean checkIthBitUsingRightShift(int n, int i) {
        if(((n >> i) & 1) == 0){
            return false;
        }

        return true;
    }
	
	public boolean checkIthBitUsingLefttShift(int n, int i) {
        if((n & (1 << i)) == 0){
            return false;
        }

        return true;
    }

}
