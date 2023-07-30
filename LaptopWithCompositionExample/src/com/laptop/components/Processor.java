package com.laptop.components;

public class Processor {
	private String brand;
	private String series;
	private String generation;
	private String numOfCors;
	private String numOfThreads;
	private String cacheMemory;
	private String frequency;

	public Processor(String brand, String series, String generation, String numOfCors, String numOfThreads,
			String cacheMemory, String frequency) {
		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.numOfCors = numOfCors;
		this.numOfThreads = numOfThreads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
	}

	public Processor() {
		this.brand = "intel";
		this.series = "i7 1234";
		this.generation = "i7";
		this.numOfCors = "8";
		this.numOfThreads = "16";
		this.cacheMemory = "64MB";
		this.frequency = "2.56 Ghz";
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", numOfCors="
				+ numOfCors + ", numOfThreads=" + numOfThreads + ", cacheMemory=" + cacheMemory + ", frequency="
				+ frequency + "]";
	}

	public String getBrand() {
		return brand;
	}

	public String getSeries() {
		return series;
	}

	public String getGeneration() {
		return generation;
	}

	public String getNumOfCors() {
		return numOfCors;
	}

	public String getNumOfThreads() {
		return numOfThreads;
	}

	public String getCacheMemory() {
		return cacheMemory;
	}

	public String getFrequency() {
		return frequency;
	}

}
