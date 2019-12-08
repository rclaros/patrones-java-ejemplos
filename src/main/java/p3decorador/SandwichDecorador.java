package p3decorador;

public class SandwichDecorador extends Sandwich {
	
	protected Sandwich sandwich;
	
	public SandwichDecorador(Sandwich sandwich) {
		this.sandwich = sandwich;
	}
	
	@Override
	public String getDescription() {
		return sandwich.getDescription();
	}
	@Override
	public double calculateCost() {
		return sandwich.calculateCost();
	}

}
