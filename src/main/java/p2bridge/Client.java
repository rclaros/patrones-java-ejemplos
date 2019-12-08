package p2bridge;

public class Client {
	
	public static void main(String[] args) {
		
	     
        Color Color1 = new Black();
        Circle circleBlack = new Circle(Color1);
   
        Color Color2 = new Blue();
        Circle circleBlue = new Circle(Color2);
        
        Color Color3 = new Red();
        Square squareRed = new Square(Color3);
       
        Color Color4 = new Green();
        Square squareGreen = new Square(Color4);
        
        
        System.out.println("*************************************************");
       
        circleBlack.applyColor();
        System.out.println("*************************************************");
        
        circleBlue.applyColor();
        System.out.println("*************************************************");
        
        squareRed.applyColor();
        System.out.println("*************************************************");
        
        squareGreen.applyColor();
        System.out.println("*************************************************");
        
        
        
	}

}
