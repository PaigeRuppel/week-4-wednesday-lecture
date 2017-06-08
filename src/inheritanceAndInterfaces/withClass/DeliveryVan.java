package inheritanceAndInterfaces.withClass;

public class DeliveryVan extends Vehicle implements GasPowered {

	private double refuelingTimeInHours;
	private int milesPerGallon;
	private int maxTankCapacity;
	private int currentFuelLevel;

	public DeliveryVan() {
		super(60);
		refuelingTimeInHours = 0.25;
		currentFuelLevel = 15;
		maxTankCapacity = 17;
		milesPerGallon = 20;
	}

	@Override
	public String getVehicleType() {
		return "Shiny battered van with dark windows.";
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
