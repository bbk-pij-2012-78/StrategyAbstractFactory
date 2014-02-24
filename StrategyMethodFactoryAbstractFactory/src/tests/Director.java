package tests;

public class Director {

	private HarrierBuilder builder;

	public Director(HarrierBuilder builder) {
		this.builder = builder;
	}

	public void constructAirplane() {
		builder.buildFlying(); 
		builder.buildLiftOff(); 
		builder.buildAirplane(); 
	}

}
