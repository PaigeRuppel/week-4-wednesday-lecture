package inheritance.withClass;

public class BoxTruck extends Vehicle {
	public BoxTruck() {
		super(55, 30, 10, 0.4);
	}

	public String getVehicleType() {
		return "Just a box truck. Not the truck you're looking for.";
	}
}
