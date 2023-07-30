package com.carscall;
import com.car.*;
public class GetCar {

	public static void main(String[] args) {
		Car BMW=new Car();
		BMW.setSpeed(20);
		BMW.setColor("Black");
		BMW.setDoor("Closed");
		BMW.setModel("Q4");
		System.out.println("BMW Car Speed is : "+BMW.getSpeed());
		System.out.println("BMW Car Speed is : "+BMW.getColor());
		System.out.println("BMW Car Speed is : "+BMW.getDoor());
		System.out.println("BMW Car Speed is : "+BMW.getModel());
		System.out.println("BMW is "+BMW.run());
		
		System.out.println("********************************************");
		
		Car swift=new Car();
		//swift.setSpeed(20);
		swift.setColor("Black");
		swift.setDoor("open");
		swift.setModel("Dzire");
		System.out.println("swift Car Speed is : "+swift.getSpeed());
		System.out.println("swift Car Speed is : "+swift.getColor());
		System.out.println("swift Car Speed is : "+swift.getDoor());
		System.out.println("swift Car Speed is : "+swift.getModel());
		System.out.println("swift is "+swift.run());

	}

}
