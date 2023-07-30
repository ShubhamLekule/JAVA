package com.laptop;

import com.laptop.components.GraphicCard;
import com.laptop.components.Processor;

public class Laptop {
	private String screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private GraphicCard garphiccard;
	private String opticalDrive;
	private String keyboard;

	public Laptop(String screen, Processor processor, String ram, String hardDrive, GraphicCard garphiccard,
			String opticalDrive, String keyboard) {

		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.garphiccard = garphiccard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	public Laptop() {
		this.screen = "35 inch";
		// below is the anonymous object
		this.processor = new Processor();
		this.ram = "32 GB";
		this.hardDrive = "2 TB";
		this.garphiccard = new GraphicCard();
		this.opticalDrive = "2GB";
		this.keyboard = "new one";
	}

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", garphiccard=" + garphiccard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}

	public String getScreen() {
		return screen;
	}

	public Processor getProcessor() {
		return processor;
	}

	public String getRam() {
		return ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public GraphicCard getGarphiccard() {
		return garphiccard;
	}

	public String getOpticalDrive() {
		return opticalDrive;
	}

	public String getKeyboard() {
		return keyboard;
	}

}
