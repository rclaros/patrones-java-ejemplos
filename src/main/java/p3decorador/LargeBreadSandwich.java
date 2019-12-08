package p3decorador;

public class LargeBreadSandwich extends Sandwich{
	
	public LargeBreadSandwich() {
		this.description = "Sandwich de pan largo";
		
	}
	
	@Override
	public String getDescription() {
		return this.description;
	}
	
	@Override
	public double calculateCost() {
		return 15.00;
	}

}
