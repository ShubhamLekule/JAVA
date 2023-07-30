package com.AlgebricEquation;

public class EquationOne {

	public static void main(String[] args) {
		double value;
		int typeCastValue,a=10;
		float b=10.10f;
		
		value=(double)(((double)a*(double)a)+((double)2*(double)a*(double)b)+((double)b* b));
		System.out.println("Value of equation = "+value);
		
		typeCastValue=(int)value;
		System.out.println("Value of type caste equation = "+typeCastValue);
				
		

	}

}
