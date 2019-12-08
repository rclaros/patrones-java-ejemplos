package p3decorador;

public class Turkey extends SandwichDecorador {
	
	public Turkey(Sandwich sandwich) {
		super(sandwich);
		this.description = "Tocino";
	}
	
	@Override
	public String getDescription() {
		return String.format("%s, : %s" , sandwich.getDescription(), this.description);
		
	}
	
	@Override
	public double calculateCost() {
		return this.sandwich.calculateCost() + 6.00;
	}

}
