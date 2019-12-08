package p1abstractFactory;

public class CarVehicleFactory extends VehicleAbstractFactory {
	
	private static final String  SEDAN = "sedan";
	private static final String  COMPACT = "compact";
	
	@Override
	public TypeVehicle createTypeVehicle(String type) {
		if (type.equals(CarVehicleFactory.SEDAN)) {
			return new SedanCar();
		}
		if (type.equals(CarVehicleFactory.COMPACT)) {
			return new CompactCar();
		}
		return new CompactCar();
	}
		

}
