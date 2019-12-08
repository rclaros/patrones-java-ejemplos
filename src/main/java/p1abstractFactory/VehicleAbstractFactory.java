package p1abstractFactory;

public abstract class VehicleAbstractFactory {
	
	public static final String CAR = "car";
	public static final String MOTORCYCLE = "motorcycle";
	
	
	
	public static VehicleAbstractFactory getVehicleFactory (String type) {
		if (type.equals(VehicleAbstractFactory.CAR)) {
			return new CarVehicleFactory();
		}
		if (type.equals(VehicleAbstractFactory.MOTORCYCLE)) {
			return new MotorcycleVehicleFactory();
		}
		return new MotorcycleVehicleFactory();
		
	}
	
	public abstract  TypeVehicle  createTypeVehicle(String type); 
	
	
}


