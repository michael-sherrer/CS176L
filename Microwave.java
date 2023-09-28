package edu.monmouth.microwave;

public class Microwave {
	
	final int ADDTIME = 30;
	
	private int timeToCook;
	
	private int powerLevel = 1;
	
	public void time(){
		timeToCook = timeToCook + ADDTIME;
	}
	
	public int getTime(){
		return timeToCook;
	}
	
	public void power(){
		powerLevel = powerLevel + 1;
		if (powerLevel > 2) powerLevel = 1;
	}
	public int getPower() {
		return powerLevel;
	}
	public void start() {
		System.out.println("Cooking for "  + timeToCook + " seconds at level " + powerLevel);
	}
	public void reset() {
		powerLevel = 1;
		timeToCook = 0;
	}

}
