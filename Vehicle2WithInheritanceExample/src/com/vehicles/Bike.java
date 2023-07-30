package com.vehicles;

import com.parent.Vehicle;

public class Bike extends Vehicle {
	private String handle;

	public Bike(String engine, String wheels, String seats, String fuelTank, String lights, String handle) {
		super(engine, wheels, seats, fuelTank, lights);
		this.handle = handle;
	}

	public Bike() {
		super();
		handle = "Not Mentioned";
	}

	public String getHandle() {
		return handle;
	}

	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
