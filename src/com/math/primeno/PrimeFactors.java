package com.math.primeno;

import java.util.*;

public class PrimeFactors {
	
	/*
	 * You are given an integer array queries of length n.
	 * 
	 * Return the prime factorization of each number in array queries in sorted
	 * order. Input : queries = [7, 12, 18]
	 * 
	 * Output : [ [7], [2, 2, 3], [2, 3, 3] ]
	 * 
	 * Explanation : The value 7 itself is a prime number.
	 * 
	 * The prime factorization of 12 will be --> 2 * 2 * 3.
	 * 
	 * The prime factorization of 18 will be --> 2 * 3 * 3.
	 */

	public static void main(String[] args) {
		PrimeFactors primeFactors = new PrimeFactors();
		int[] quries = {7, 12, 18};
		List<List<Integer>> ans = primeFactors.primeFactors(quries);
		
		for(int i=0; i<ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
		
		
	}
	
	public List<List<Integer>> primeFactors(int[] queries) {
	    List<List<Integer>> result = new ArrayList<>();

	    int max = 0;
	    for (int q : queries) {
	        max = Math.max(q, max);
	    }

	    int[] SPF = sieve(max);

	    for (int q : queries) {
	        List<Integer> ans = new ArrayList<>();
	        while (q>1) {
	            ans.add(SPF[q]);
	            q = q/SPF[q];
	        }
	        result.add(ans);
	    }

	    return result;
	}

	public int[] sieve(int n) {
	    int[] SPF = new int[n+1];

	    for(int i=2; i<=n; i++) {
	        if(SPF[i] == 0) {
	            SPF[i] = i;
	            for(int j = i*i; j<=n; j+=i) {
	                if(SPF[j] == 0){
	                    SPF[j] = i;
	                }
	            }
	        }
	    }

	    return SPF;
	}

}
