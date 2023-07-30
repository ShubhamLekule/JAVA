package com.car;

public class Car {
	
	private String door;
	private String color;
	private String model;
	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	private int speed;
	
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public String run() {
		if(speed>0 && door.toLowerCase().equals("closed")) {
			return "Running";
		}else {
			return "Not Running";
		}
	}
	
}
