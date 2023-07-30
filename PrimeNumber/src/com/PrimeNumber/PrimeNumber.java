package com.PrimeNumber;

public class PrimeNumber {

	public static void main(String[] args) {
		int x=6;
		boolean prime=false;
		for(int i=2;i<x ;i++) {
			if(x%i==0) {
				prime = true;
			}
		}
		if(prime==true) {
			System.out.println("Number is not Prime");
		}else {
			System.out.println("Number is prime");
		}

	}

}
