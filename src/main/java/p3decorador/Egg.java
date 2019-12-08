package p3decorador;

public class Egg extends SandwichDecorador{
	
	public Egg(Sandwich sandwich) {
		super(sandwich);
		this.description = "Tocino";
	}
	
	@Override
	public String getDescription() {
		return String.format("%s, : %s" , sandwich.getDescription(), this.description);
		
	}
	
	@Override
	public double calculateCost() {
		return this.sandwich.calculateCost() + 1.00;
	}

}
