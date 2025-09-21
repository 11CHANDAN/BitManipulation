package com.bit.medium;

public class OneToNXor {

	public static void main(String[] args) {
		System.out.println(find1ToNxor(1));
		System.out.println(find1ToNxor(7));
		System.out.println(find1ToNxor(6));
		System.out.println(find1ToNxor(9));
	}
	
	public static int find1ToNxor(int n) {
		if(n%4 == 1) {
			return 1;
		} else if(n%4 == 2) {
			return n+1;
		} else if(n%4 == 3) {
			return 0;
		} else {
			return n;
		}
	}

}
