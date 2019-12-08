package p3decorador;

public class Beef extends SandwichDecorador{
	
	public Beef(Sandwich sandwich) {
		super(sandwich);
		this.description = "Carne";
	}
	
	@Override
	public String getDescription() {
		return String.format("%s, : %s" , sandwich.getDescription(), this.description);
		
	}
	
	@Override
	public double calculateCost() {
		return this.sandwich.calculateCost() + 7.00;
	}

}
