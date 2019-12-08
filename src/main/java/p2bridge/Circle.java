package p2bridge;

public class Circle extends Shape {
	
	public Circle(Color color) {
		super(color);

	}
	
	@Override
	public void applyColor() {
		System.out.println("-* Circulo de color: " + color.applyColor());
	}

}
