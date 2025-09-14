package com.bit.easy;

public class CountTheNumberOfSetBits {

	public static void main(String[] args) {
		System.out.println(countSetBits(5));
		System.out.println(countSetBits(15));
		System.out.println(countSetBits(32));
	}
	
	public static int countSetBits(int n) {
        // Your code goes here
        int cnt =0;
        while(n>0){
            cnt += n&1;
            n = n>>1;
        }
        return cnt;
    }

}
