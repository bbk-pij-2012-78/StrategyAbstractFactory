package tests;

import vehicles.Airplane;
import vehicles.Flying;
import vehicles.FlyingFactory;
import vehicles.LiftOff;
import vehicles.LiftOffFactory;

public class HarrierBuilder {

	private Airplane airplane;
	private Flying flying;
	private LiftOff liftOff;

	public Airplane getAirplane() {
		return airplane; 
	}

	public void buildFlying() {
		FlyingFactory flyingFactory = new FlyingFactory(); 
		flying = flyingFactory.createFlying("Fighter Jet"); 
		
	}

	public void buildLiftOff() {
		LiftOffFactory liftOffFactory = new LiftOffFactory(); 
		liftOff = liftOffFactory.createLiftOff("Vertically");		
	}

	public void buildAirplane() {
		airplane = new Airplane(liftOff,flying); 
	}

}
