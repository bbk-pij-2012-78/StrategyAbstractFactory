package vehicles;

import tests.Builder;

public class HarrierBuilder implements Builder {

	private Airplane airplane;
	private Flying flying;
	private LiftOff liftOff;

	/* (non-Javadoc)
	 * @see tests.Builder#getAirplane()
	 */
	@Override
	public Airplane getAirplane() {
		return airplane; 
	}

	/* (non-Javadoc)
	 * @see tests.Builder#buildFlying()
	 */
	@Override
	public void buildFlying() {
		flying = FlyingFactory.createFlying("Fighter Jet"); 
		
	}

	/* (non-Javadoc)
	 * @see tests.Builder#buildLiftOff()
	 */
	@Override
	public void buildLiftOff() {
		liftOff = LiftOffFactory.createLiftOff("Vertically");		
	}

	/* (non-Javadoc)
	 * @see tests.Builder#buildAirplane()
	 */
	@Override
	public void buildAirplane() {
		airplane = new Airplane(liftOff,flying); 
	}

}
