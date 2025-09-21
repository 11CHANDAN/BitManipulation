package com.math;

public class PowerExponentiation {
	
	/*
	 * Implement the power function pow(x, n) , which calculates the x raised to n
	 * i.e. xn.
	 * 
	 * Note : In output print 6 digits places after decimal point.
	 * 
	 * Input : x = 2.0000 , n = 10
	 * 
	 * Output : 1024.0000
	 * 
	 * Explanation : Answer = 2^10 => 1024.
	 * 
	 * Input : x = 2.0000 , n = -2
	 * 
	 * Output : 0.2500
	 * 
	 * Explanation : Answer = 2^(-2) = 1/4 => 0.25.
	 */

	public static void main(String[] args) {
		System.out.println(myPow(2.0, 10));
		System.out.println(myPow(2.0, -2));
	}
	
	public static double myPow(double x, int n) {
		if(n==0 || x == 1){
            return 1.0;
        }

        long N = n;
        if(N<0){
            x = 1/x;
            N = -N;
        }

        double ans = 1;

        while(N>0){
            if (N%2 == 1){
                ans *= x;
                N--;
            } else {
                x *= x;
                N = N/2;
            }
        }

        return ans;
	}

}
