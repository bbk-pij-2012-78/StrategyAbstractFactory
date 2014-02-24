package vehicles;

import tests.Builder;
import vehicles.Airplane;
import vehicles.Flying;
import vehicles.FlyingFactory;
import vehicles.LiftOff;
import vehicles.LiftOffFactory;

public class PassengerBuilder implements Builder {

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
		flying = FlyingFactory.createFlying("Passenger Airplane"); 
		
	}

	/* (non-Javadoc)
	 * @see tests.Builder#buildLiftOff()
	 */
	@Override
	public void buildLiftOff() {
		liftOff = LiftOffFactory.createLiftOff("Horizontally");		
	}

	/* (non-Javadoc)
	 * @see tests.Builder#buildAirplane()
	 */
	@Override
	public void buildAirplane() {
		airplane = new Airplane(liftOff,flying); 
	}

}
