package com.bit.medium;

public class DivideTwoNos {

	public static void main(String[] args) {
		System.out.println(divide(10, 3));
		System.out.println(divide(-7, 3));
	}
	
	public static int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;

        if(divisor == 1) return dividend;

        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        boolean isPositive = !((dividend<0 && divisor>0) || (dividend>0 && divisor<0));

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long ans = 0;

        while(n>=d){
            int count = 0;

            while(n >= (d << (count+1))){
                count++;
            }

            ans += (1<<count);
            n -= d << count;
        }

        if(ans > Integer.MAX_VALUE)
            return (isPositive) ? Integer.MAX_VALUE : Integer.MIN_VALUE;

        return (isPositive) ? (int) ans :(int) -ans;
    }
	
//	//brute force approach by adding divisor 
//	public int divide(int dividend, int divisor) {
//        // Base case: both numbers equal
//        if (dividend == divisor) return 1;
//
//        // Handle overflow (Integer.MIN_VALUE / -1)
//        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
//
//        // Dividing by 1 returns the number itself
//        if (divisor == 1) return dividend;
//
//        // Determine the sign of the result
//        boolean isPositive = !((dividend >= 0 && divisor < 0) || (dividend < 0 && divisor > 0));
//
//        // Convert to long for safety and take absolute values
//        long n = Math.abs((long) dividend);
//        long d = Math.abs((long) divisor);
//
//        // Variables to store result and cumulative sum
//        long ans = 0, sum = 0;
//
//        // Brute-force loop: keep subtracting divisor from dividend
//        while (sum + d <= n) {
//            ans++;
//            sum += d;
//        }
//
//        // Check for overflow
//        if (ans > Integer.MAX_VALUE)
//            return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//
//        // Apply sign and return
//        return isPositive ? (int) ans : (int) -ans;
//    }

}
