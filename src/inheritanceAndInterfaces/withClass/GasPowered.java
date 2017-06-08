package inheritanceAndInterfaces.withClass;

//  interfaces are always abstract, so no need to specify "abstract"
public interface GasPowered {

	int getCurrentFuelLevel();

	int getMilesPerGallon();

	// always public abstract, so no need to specify
	double travelTimeBeforeRefueling();

	double travelFor(double hours);
}
