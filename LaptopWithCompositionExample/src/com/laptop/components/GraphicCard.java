package com.laptop.components;

public class GraphicCard {
	private String brand;
	private String series;
	private String memory;

	public GraphicCard(String brand, String series, String memory) {
		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}

	public GraphicCard() {
		this.brand = "nvidia";
		this.series = "17";
		this.memory = "8 GB";
	}

	@Override
	public String toString() {
		return "GraphicCard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
	}

	public String getBrand() {
		return brand;
	}

	public String getSeries() {
		return series;
	}

	public String getMemory() {
		return memory;
	}

}
