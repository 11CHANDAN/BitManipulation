package com.math.primeno;

public class PrintPrime1toN {

	public static void main(String[] args) {
		System.out.println(prime(10));
		System.out.println(prime(20));
		System.out.println(prime(5));
	}
	
	public static int prime(int n) {		
		if(n<2) {
			return 0;
		}
		
		int count = n-2;
		
		boolean[] prime = new boolean[n];
		
		for(int i=2; i*i<n; i++) {
			if(prime[i] == false) {
				for(int j = i*i; j<n; j+=i) {
					if(prime[j] == false) {
						count--;
					}
					prime[j] = true;
				}
			}
		}
		
		return count;
	}

}
