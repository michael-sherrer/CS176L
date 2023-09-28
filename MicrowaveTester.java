package edu.monmouth.micro.test;

import edu.monmouth.microwave.Microwave;

public class MicrowaveTester {

	public static void main(String[] args) {
		Microwave buttonPressed  = new Microwave();
		buttonPressed.time();
		System.out.println("Time button was pressed. Time is " + buttonPressed.getTime() + " seconds");
		buttonPressed.time();
		System.out.println("Time button was pressed. Time is " + buttonPressed.getTime() + " seconds");
		buttonPressed.power();
		System.out.println("Power button was pressed. Power level is " + buttonPressed.getPower());
		buttonPressed.start();
		buttonPressed.reset();
		System.out.println("Reset button was pressed. Power level is " + buttonPressed.getPower() + ". Time is " + buttonPressed.getTime() + " seconds.");
	}

}
