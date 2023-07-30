package com.vehicles;

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
		super();
		this.steering = "Not Mentioned";
		this.musicSystem = "Not Mentioned";
		this.seatBelt = "Not Mentioned";
		this.airConditioner = "Not Mentioned";
		this.fridge = "Not Mentioned";
		this.entertainmentSystem = "Not Mentioned";
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

	@Override
	public String toString() {
		return "Car [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem() + ", getSeatBelt()="
				+ getSeatBelt() + ", getAirConditioner()=" + getAirConditioner() + ", getFridge()=" + getFridge()
				+ ", getEntertainmentSystem()=" + getEntertainmentSystem() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank()
				+ ", getLights()=" + getLights() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
