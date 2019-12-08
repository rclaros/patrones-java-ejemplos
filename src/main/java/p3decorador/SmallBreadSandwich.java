package p3decorador;

public class SmallBreadSandwich extends Sandwich{
	
	public SmallBreadSandwich() {
		this.description = "Sandwich de pan pequeño";
		
	}
	
	@Override
	public String getDescription( ) {
		return this.description;
		
	}
	
	@Override
	public double calculateCost() {
		return 10.00;
	}

}
