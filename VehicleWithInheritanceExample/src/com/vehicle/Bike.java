package com.vehicle;

import com.parent.Vehicle;

public class Bike extends Vehicle {

	private String handle;

	public Bike(String engine, String wheels, String seats, String fuelTank, String lights, String handle) {
		super(engine, wheels, seats, fuelTank, lights);
		this.handle = handle;
	}

	public Bike() {

	}

	public String getHandle() {
		return handle;
	}

	public String run() {
		if (engine.equals("on")) {
			return "Running";
		} else {
			return "Not Running";
		}
	}
}
