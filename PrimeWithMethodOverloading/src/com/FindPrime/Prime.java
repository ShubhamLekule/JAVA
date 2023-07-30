package com.FindPrime;
import com.Prime.IsPrime;
public class Prime {

	public static void main(String[] args) {
		IsPrime p=new IsPrime();
		//if(p.prime(5.0d)==false) {
		if(p.prime(5)==false) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is Not Prime");
		}

	}

}
