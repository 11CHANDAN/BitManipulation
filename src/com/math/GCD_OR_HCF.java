package com.math;

public class GCD_OR_HCF {

	public static void main(String[] args) {
		System.out.println(GCD(4,6));
		System.out.println(euclidean_GCD(54, 12));
	}
	
	//optimal approach using Euclidean approach
	public static int euclidean_GCD(int n1, int n2) {
        while(n1>0 && n2>0){
            if(n1>n2) 
                n1 = n1%n2;
            else
                n2 = n2%n1;
        }

        if(n1 == 0) return n2;
        return n1;
    }
	
	//brute-force
	public static int GCD(int n1, int n2) {
        for(int i=Math.min(n1,n2); i>=1; i--){
            if(n1%i == 0 && n2%i==0){
                return i;
            }
        }
        return 1;
    }

}
