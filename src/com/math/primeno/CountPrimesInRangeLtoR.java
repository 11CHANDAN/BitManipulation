package com.math.primeno;

import java.util.ArrayList;

public class CountPrimesInRangeLtoR {
	
	/*
	 * You are given an 2D array queries of dimension n*2.
	 * 
	 * The queries[i] represents a range from queries[i][0] to queries[i][1]
	 * (include the end points).
	 * 
	 * Return the count of prime numbers present in between each range in queries
	 * array
	 * 
	 * Input : queries = [ [2, 5], [4, 7] ]
	 * 
	 * Output : [3, 2]
	 * 
	 * Explanation : The range 2 to 5 contains three prime numbers 2, 3, 5.
	 * 
	 * The range 4 to 7 contains two prime numbers 5, 7.
	 */

	public static void main(String[] args) {
		ArrayList<int[]> queries = new ArrayList<int[]>();
		queries.add(new int[] {2,5});
		queries.add(new int[] {4,7});
		
		System.out.println(primesInRange(queries));
	}

	public static ArrayList<Integer> primesInRange(ArrayList<int[]> queries) {
	    // your code goes here
	    ArrayList<Integer> ans = new ArrayList<>();
	    int start = Integer.MAX_VALUE;
	    int end = Integer.MIN_VALUE;

	    for (int i = 0; i < queries.size(); i++) {
	      int[] arr = queries.get(i);
	      start = Math.min(start, arr[0]);
	      end = Math.max(end, arr[1]);
	    }

	    int[] primes = sieve(end);
	    int count = 0;

	    for (int i = 2; i <= end; i++) {
	      if (primes[i] == 0) {
	        count++;
	      }
	      primes[i] = count;
	    }

	    for (int i = 0; i < queries.size(); i++) {
	      int[] arr = queries.get(i);
	      int primeCount = primes[arr[1]] - primes[arr[0] - 1];
	      ans.add(primeCount);
	    }
	    
	    return ans;
	  }

	  public static int[] sieve(int end) {
	    int[] primes = new int[end + 1];

	    for (int i = 2; i * i <= end; i++) {
	      if (primes[i] == 0) {
	        for (int j = i * i; j <= end; j += i) {
	          primes[j] = 1;
	        }
	      }
	    }

	    return primes;
	  }

}
