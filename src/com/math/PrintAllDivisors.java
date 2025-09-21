package com.math;

import java.util.*;
import java.util.Scanner;

public class PrintAllDivisors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] divisors = new int[n];
		int count = 0;
		
		// sqrt also take some time complexity so use i*i
//		for(int i=1; i<= Math.sqrt(n); i++) {
		for(int i=1; i*i<= n; i++) {
			if (n%i == 0) {
				divisors[count] = i;
				count ++;
				if(n/i != i) {
					divisors[count] = n/i;
					count ++;
				}
			}
		}

		int[] ans = Arrays.copyOf(divisors, count);

		Arrays.sort(ans);

		System.out.println(Arrays.toString(ans));
	}

}
