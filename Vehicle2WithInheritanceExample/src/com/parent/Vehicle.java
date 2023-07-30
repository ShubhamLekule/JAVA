package com.parent;

public class Vehicle {
	private String engine;
	private String wheels;
	private String seats;
	private String fuelTank;
	private String lights;

	public Vehicle(String engine, String wheels, String seats, String fuelTank, String lights) {
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.lights = lights;
	}

	public Vehicle() {
		this.engine = "off";
		this.wheels = "0";
		this.seats = "Not Mentioned";
		this.fuelTank = "Not Mentioned";
		this.lights = "Not Mentioned";
	}

	public String getEngine() {
		return engine;
	}

	public String getWheels() {
		return wheels;
	}

	public String getSeats() {
		return seats;
	}

	public String getFuelTank() {
		return fuelTank;
	}

	public String getLights() {
		return lights;
	}
}
