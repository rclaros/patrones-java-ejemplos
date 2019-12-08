package p1abstractFactory;

public class MotorcycleVehicleFactory extends VehicleAbstractFactory{
	
	private static final String  SCOOTER = "scooter";
	private static final String  SPORTBIKE = "sportbike";

	@Override
	public TypeVehicle createTypeVehicle(String type) {
		 if (type.equals(MotorcycleVehicleFactory.SCOOTER)) {
	            return new Scooter();
	        }
	        if (type.equals(MotorcycleVehicleFactory.SPORTBIKE)) {
	            return new SportBike();
	        }
	        return new SportBike();

}
	

}
