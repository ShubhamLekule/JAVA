package com.setlaptop;

import com.laptop.*;
import com.laptop.components.GraphicCard;
import com.laptop.components.Processor;

public class SetLaptop {

	public static void main(String[] args) {
		Laptop lappy = new Laptop();
		System.out.println("Laptop Details are : " + lappy);
		// calling object inside the object
		System.out.println("Processor details is : " + lappy.getProcessor().getGeneration());
		Laptop gamingLaptop = new Laptop("45 inch", new Processor("nvidia", "i10", "i10", "64", "64", "2GB", "3Ghz"),
				"32GB", "4TB", new GraphicCard("nvidia", "i10", "32GB"), "", "");
		System.out.println("Gaming Laptop :" + gamingLaptop);

	}

}
