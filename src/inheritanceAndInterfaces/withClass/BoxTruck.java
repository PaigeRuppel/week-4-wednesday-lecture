package inheritanceAndInterfaces.withClass;

public class BoxTruck extends Vehicle implements GasPowered {
	private double refuelingTimeInHours;
	private int milesPerGallon;
	private int maxTankCapacity;
	private int currentFuelLevel;

	public BoxTruck() {
		super(55);
		refuelingTimeInHours = 0.4;
		maxTankCapacity = 30;
		currentFuelLevel = 10;
		milesPerGallon = 12;
	}

	public String getVehicleType() {
		return "Just a box truck. Not the truck you're looking for.";
	}

	@Override
	public double travelTimeBeforeRefueling() {
		// (double) value causes the value to be treated like a double
		return (double) currentRange() / rateOfTravelPerHour;
	}

	/**
	 * Travels for <code>hours</code>, then returns the distance travelled.
	 */
	@Override
	public double travelFor(double hours) {
		if (hours >= travelTimeBeforeRefueling()) {
			return (hours - refuelingTimeInHours) * rateOfTravelPerHour;
		}
		return hours * rateOfTravelPerHour;
	}

	public int currentRange() {
		return getCurrentFuelLevel() * getMilesPerGallon();
	}

	public int getCurrentFuelLevel() {
		return currentFuelLevel;
	}

	public int getMilesPerGallon() {
		return milesPerGallon;
	}
}
