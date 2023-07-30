package com.main;

import com.parent.*;
import com.vehicles.*;

public class RunVehicle {

	public static void main(String[] args) {
		Car c = new Car();
		Bike b = new Bike();
		Truck t = new Truck();
		System.out.println("Car Engine :" + c.getEngine());
		System.out.println("Car Wheels :" + c.getWheels());
		System.out.println("Car Seats :" + c.getSeats());
		System.out.println("Car Fuel Tank :" + c.getFuelTank());
		System.out.println("Car Lights :" + c.getLights());
		System.out.println("Car Steering :" + c.getSteering());
		System.out.println("Car Music System :" + c.getMusicSystem());
		System.out.println("Car Seat Belt :" + c.getSeatBelt());
		System.out.println("Car Air Conditioner :" + c.getAirConditioner());
		System.out.println("Car Fridge :" + c.getFridge());
		System.out.println("Car Entertainment System :" + c.getEntertainmentSystem());
		System.out.println("*********************************************************");
		System.out.println("Bike Engine :" + b.getEngine());
		System.out.println("Bike Wheels :" + b.getWheels());
		System.out.println("Bike Seats :" + b.getSeats());
		System.out.println("Bike Fuel Tank :" + b.getFuelTank());
		System.out.println("Bike Lights :" + b.getLights());
		System.out.println("Bike Handle :" + b.getHandle());
		System.out.println("*********************************************************");
		System.out.println("Truck Engine :" + t.getEngine());
		System.out.println("Truck Wheels :" + t.getWheels());
		System.out.println("Truck Seats :" + t.getSeats());
		System.out.println("Truck Fuel Tank :" + t.getFuelTank());
		System.out.println("Truck Lights :" + t.getLights());
		System.out.println("Truck Steering :" + t.getSteering());
		System.out.println("Truck Music System :" + t.getMusicSystem());
		System.out.println("Truck Seat Belt :" + t.getSeatBelt());
		System.out.println("Truck Air Conditioner :" + t.getAirConditioner());
		System.out.println("Truck Container :" + t.getContainer());
		System.out.println("*********************************************************");
		System.out.println("\n\nAfter Assigning Values\n ");
		Car c1 = new Car("on", "4", "5", "petrol", "LED", "Wide", "Boat", "yes", "samsung", "LG", "boss");
		Bike b1 = new Bike("on", "2", "2", "petrol", "LED", "Short");
		Truck t1 = new Truck("on", "8", "2", "Diesel", "LED", "Wide", "Boat", "yes", "samsung", "yes");
		System.out.println("Car Engine :" + c1.getEngine());
		System.out.println("Car Wheels :" + c1.getWheels());
		System.out.println("Car Seats :" + c1.getSeats());
		System.out.println("Car Fuel Tank :" + c1.getFuelTank());
		System.out.println("Car Lights :" + c1.getLights());
		System.out.println("Car Steering :" + c1.getSteering());
		System.out.println("Car Music System :" + c1.getMusicSystem());
		System.out.println("Car Seat Belt :" + c1.getSeatBelt());
		System.out.println("Car Air Conditioner :" + c1.getAirConditioner());
		System.out.println("Car Fridge :" + c1.getFridge());
		System.out.println("Car Entertainment System :" + c1.getEntertainmentSystem());
		System.out.println("*********************************************************");
		System.out.println("Bike Engine :" + b1.getEngine());
		System.out.println("Bike Wheels :" + b1.getWheels());
		System.out.println("Bike Seats :" + b1.getSeats());
		System.out.println("Bike Fuel Tank :" + b1.getFuelTank());
		System.out.println("Bike Lights :" + b1.getLights());
		System.out.println("Bike Handle :" + b1.getHandle());
		System.out.println("*********************************************************");
		System.out.println("Truck Engine :" + t1.getEngine());
		System.out.println("Truck Wheels :" + t1.getWheels());
		System.out.println("Truck Seats :" + t1.getSeats());
		System.out.println("Truck Fuel Tank :" + t1.getFuelTank());
		System.out.println("Truck Lights :" + t1.getLights());
		System.out.println("Truck Steering :" + t1.getSteering());
		System.out.println("Truck Music System :" + t.getMusicSystem());
		System.out.println("Truck Seat Belt :" + t1.getSeatBelt());
		System.out.println("Truck Air Conditioner :" + t1.getAirConditioner());
		System.out.println("Truck Container :" + t1.getContainer());
		System.out.println("*********************************************************");
		System.out.println("\n\n Object Print \n \n");
		System.out.println("Car Object : " + c1);
		System.out.println("*********************************************************");
		System.out.println("Bike Object : " + b1);
		System.out.println("*********************************************************");
		System.out.println("Truck Object : " + t1);

	}

}
