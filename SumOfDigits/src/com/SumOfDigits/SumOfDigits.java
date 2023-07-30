package com.SumOfDigits;

public class SumOfDigits {

	public static void main(String[] args) {
		int x=1234,sum=0,div=x,mod=0;
		String s=String.valueOf(x);
		System.out.println(s.length());
		for(int i=1;i<=s.length();i++) {
			mod=div%10;
			div=div/10;
			sum=sum+mod;
		}
		System.out.println("Sum of Digit = "+sum);
	}

}
