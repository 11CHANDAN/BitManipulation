package com.bit.medium;

public class XOROfNumbersInAGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findRangeXOR(3, 5));
	}
	
	public static int findRangeXOR(int l, int r) {
        return find1ToNxor(l-1) ^ find1ToNxor(r);
    }

    public static int find1ToNxor(int n) {
		if(n%4 == 1) {
			return 1;
		} else if(n%4 == 2) {
			return n+1;
		} else if(n%4 == 3) {
			return 0;
		} else {
			return n;
		}
	}

}
