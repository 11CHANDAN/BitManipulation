package com.bit.easy;

public class NumToBinary {

	public static void main(String[] args) {
		System.out.println(convertNumToBinary(13));
		System.out.println(convertNumToBinary(10));
		
		System.out.println(convertBinaryToNum("1101"));
		System.out.println(convertBinaryToNum("1010"));
	}
	
	public static String convertNumToBinary(int num) {
		StringBuilder res = new StringBuilder();
		
		while(num>0) {
			int val = num%2;
			res = res.append(val);
			num = num/2;
		}
		
		return res.reverse().toString();
	}
	
	public static int convertBinaryToNum(String binary) {
		int num = 0;
		int p = 1;
		for(int i=binary.length()-1; i>=0; i--) {
			if(binary.charAt(i) == '1') {
				num += p;				
			}
			p *=2;
		}
		return num;
	}

}
