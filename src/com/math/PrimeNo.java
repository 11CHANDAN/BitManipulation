package com.math;

public class PrimeNo {

	public static void main(String[] args) {
		if(checkPrime(10)) {
			System.out.println("prime no");
		}else {
			System.out.println("not a prime no");
		}
		
		if(checkPrime(7)) {
			System.out.println("prime no");
		}else {
			System.out.println("not a prime no");
		}
	}
	
	public static boolean checkPrime(int n) {
		for(int i=2; i<=Math.sqrt(n);i++) {
			if(n%i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
