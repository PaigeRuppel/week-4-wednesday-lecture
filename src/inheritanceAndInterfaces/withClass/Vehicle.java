package inheritanceAndInterfaces.withClass;

public abstract class Vehicle {

	protected int rateOfTravelPerHour; // mph

	// this means that vehicles must implement this method
	public abstract String getVehicleType();

	public Vehicle(int rate) {
		rateOfTravelPerHour = rate;
	}

	public abstract double travelFor(double hours);

	public abstract int currentRange();

}
