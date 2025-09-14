package com.bit.easy;

public class Swap2Nos {
	
	public static void main(String[] args) {
		swapUsingThirdVariable(1, 2);
		swapUsingXorOperator(1, 2);
		swapUsingMathOperation(1, 2);
	}
	
	public static void swapUsingThirdVariable(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		
		System.out.print(a);
		System.out.print(" "+b);
		System.out.println();
	}
	
	public static void swapUsingXorOperator(int a , int b) {
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.print(a);
		System.out.print(" "+b);
		System.out.println();
	}
	
	public static void swapUsingMathOperation(int a, int b) {
		if(a!=b) {
			a = a+b;
			b = a-b;
			a = a-b;
		}
		
		System.out.print(a);
		System.out.print(" "+b);
		System.out.println();
	}

}
