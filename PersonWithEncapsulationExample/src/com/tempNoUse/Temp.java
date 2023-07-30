package com.tempNoUse;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// when we get input for int before string, string value not taken as next line
		// char assigne to string
		System.out.println("enter value for i");
		int i = scan.nextInt();
		System.out.println("enter value for s");
		String s = scan.nextLine();
		// if we gave 10 & hi only 10 value to i variable taken hi will not assign to
		// variable s
		System.out.println(i);
		System.out.println(s);

		// here we taking dummy variable to nullify nexline char from i
		System.out.println("enter value for i");
		i = scan.nextInt();
		String dummy = scan.nextLine();
		System.out.println("enter value for s");
		s = scan.nextLine();
		System.out.println(i);
		System.out.println(s);
	}

}
