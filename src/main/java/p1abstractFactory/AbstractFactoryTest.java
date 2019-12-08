package p1abstractFactory;

public abstract class AbstractFactoryTest {
	
public static void main(String[] args) throws Exception {
        
    	String subType = "tipo Vehiculo";
    	VehicleAbstractFactory vehicleabstractFactory =  VehicleAbstractFactory.getVehicleFactory(subType);
    	
        TypeVehicle typeVehicle = vehicleabstractFactory.createTypeVehicle(subType);
        System.out.println(typeVehicle.getFeatures());
        
    }

}
