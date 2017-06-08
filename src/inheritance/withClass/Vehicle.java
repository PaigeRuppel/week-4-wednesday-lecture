package inheritance.withClass;

public abstract class Vehicle {

	private int rateOfTravelPerHour; // mph

	// fuel
	private int milesPerGallon;
	private int maxTankCapacity;
	private int currentFuelLevel;
	private double refuelingTimeInHours;

	// this means that vehicles must implement this method
	public abstract String getVehicleType();

	public Vehicle(int rate, int fuel, int mpg, double refuelingTime) {
		rateOfTravelPerHour = rate;
		currentFuelLevel = fuel;
		milesPerGallon = mpg;
		refuelingTimeInHours = refuelingTime;
	}

	/**
	 * Travels for <code>hours</code>, then returns the distance travelled.
	 */
	public double travelFor(double hours) {
		if (hours >= travelTimeBeforeRefueling()) {
			return (hours - refuelingTimeInHours) * rateOfTravelPerHour;
		}
		return hours * rateOfTravelPerHour;
	}

	public int currentRange() {
		return currentFuelLevel * milesPerGallon;
	}

	public double travelTimeBeforeRefueling() {
		// (double) value causes the value to be treated like a double
		return (double) currentRange() / rateOfTravelPerHour;
	}

}
