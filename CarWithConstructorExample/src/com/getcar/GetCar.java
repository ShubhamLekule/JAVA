package com.getcar;

import com.car.*;

public class GetCar {

	public static void main(String[] args) {
		// No argument or default constructor
		Car c1 = new Car();
		System.out.println("c1 car is " + c1.run());

		// Parameterized Constructor
		Car c2 = new Car(10, "closed", "black", "on");
		System.out.println("c2 car is " + c2.run());

		// copy constructor using constructor, (deep copy)
		Car c3 = new Car(c2);
		System.out.println("c3 car is " + c3.run());

		// Copy Constructor by assigning value of one object to another, (Shallow copy)
		Car c4 = new Car();
		c4.setSpeed(c2.getSpeed());
		c4.setDoor(c2.getDoor());
		c4.setColor(c2.getColor());
		c4.setEngin(c2.getEngin());
		System.out.println("c4 car is " + c4.run());

	}

}
