package com.main;

import com.vehicle.*;
import com.parent.*;

public class RunVehicle {

	public static void main(String[] args) {
		Bike b = new Bike("on", "", "", "", "", "");
		Car c = new Car("on", "", "", "", "", "", "", "", "", "", "");
		Truck t = new Truck("on", "", "", "", "", "", "", "", "", "");

		System.out.println("Bike is " + b.run());
		System.out.println("Car is " + c.run());
		System.out.println("Truck is " + t.run());

	}

}
