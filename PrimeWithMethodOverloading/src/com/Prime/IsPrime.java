package com.Prime;

public class IsPrime {
	
	public boolean prime(int num) {
		boolean isPrime=false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=true;
			}
		}
		return isPrime;
	}
	public boolean prime(double x) {
		int num=(int)x;
		boolean isPrime=false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=true;
			}
		}
		return isPrime;
	}

}
