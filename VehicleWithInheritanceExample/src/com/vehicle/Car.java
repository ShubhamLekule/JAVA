package com.vehicle;

import com.parent.Vehicle;

public class Car extends Vehicle {
	private String steering;
	private String musicSystem;
	private String seatBelt;
	private String airConditioner;
	private String fridge;
	private String entertainmentSystem;

	public Car(String engine, String wheels, String seats, String fuelTank, String lights, String steering,
			String musicSystem, String seatBelt, String airConditioner, String fridge, String entertainmentSystem) {
		super(engine, wheels, seats, fuelTank, lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.seatBelt = seatBelt;
		this.airConditioner = airConditioner;
		this.fridge = fridge;
		this.entertainmentSystem = entertainmentSystem;
	}

	public Car() {

	}

	public String getSteering() {
		return steering;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public String getSeatBelt() {
		return seatBelt;
	}

	public String getAirConditioner() {
		return airConditioner;
	}

	public String getFridge() {
		return fridge;
	}

	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}

	public String run() {
		if (engine.equals("on")) {
			return "Running";
		} else {
			return "Not Running";
		}
	}
}
