package com.Area;

public class Area {

	public static void main(String[] args) {
		System.out.println("Area of Rectangle = "+area(5,2));
		System.out.println("Area of circle = "+area(5.0d));
		System.out.println("Area of Square = "+area(5));

	}
	public static double area(double l,double w) {
		return l*w;
	}
	public static double area(double r) {
		return 2*r*3.14;
	}
	public static int area(int l) {
		return l*l;
	}

}
