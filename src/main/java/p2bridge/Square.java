package p2bridge;

public class Square extends Shape{
	
	public Square(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println("-* Cuadrado de color: " + color.applyColor());
	}

}
