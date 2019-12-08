package p3decorador;

public class Bacon extends SandwichDecorador{
	
	public Bacon(Sandwich sandwich) {
		super(sandwich);
		this.description = "Tocino";
	}
	
	@Override
	public String getDescription() {
		return String.format("%s, : %s" , sandwich.getDescription(), this.description);
		
	}
	
	@Override
	public double calculateCost() {
		return this.sandwich.calculateCost() + 5.00;
	}

}
