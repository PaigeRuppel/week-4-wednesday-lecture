package inheritance.withClass;

public class VehiclesApp {

	public static void main(String[] args) {

		Vehicle van = new DeliveryVan();
		deliverStuffWith(van);

		System.out.println();

		Vehicle truck = new BoxTruck();
		deliverStuffWith(truck);

		System.out.println();

		Vehicle bicycle = new Bicycle();
		deliverStuffWith(bicycle);
	}

	private static void deliverStuffWith(Vehicle v) {
		System.out.println("My vehicle is a " + v.getVehicleType());
		System.out.println("My vehicles current range is " + v.currentRange());
		System.out.println("I have enough gas for " + v.travelTimeBeforeRefueling() + " hours");
		System.out.println("In 3 hours, I travel " + v.travelFor(3));
		System.out.println("In 6 hours, I travel " + v.travelFor(6));
	}

}
