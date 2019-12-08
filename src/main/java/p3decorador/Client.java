package p3decorador;

import java.text.DecimalFormat;

public class Client {
	
public static void main(String[] args) {
		
		Sandwich smallBreadSandwich = new SmallBreadSandwich(); 
		smallBreadSandwich = new Bacon(smallBreadSandwich);
		smallBreadSandwich = new Beef(smallBreadSandwich);
		smallBreadSandwich = new Chicken(smallBreadSandwich);
		smallBreadSandwich = new Egg(smallBreadSandwich);
		smallBreadSandwich = new Turkey(smallBreadSandwich);
		
		System.out.println(smallBreadSandwich.getDescription());
		System.out.println(round(smallBreadSandwich.calculateCost()));

		Sandwich largeBreadSandwich = new LargeBreadSandwich();
		largeBreadSandwich = new Bacon(largeBreadSandwich);
		largeBreadSandwich = new Beef(largeBreadSandwich);
		largeBreadSandwich = new Chicken(largeBreadSandwich);
		largeBreadSandwich = new Egg(largeBreadSandwich);
		largeBreadSandwich = new Turkey(largeBreadSandwich);
		
		System.out.println(largeBreadSandwich.getDescription());
		System.out.println(round(largeBreadSandwich.calculateCost()));

		 }

		    public static double round(double value) {
		        DecimalFormat newFormat = new DecimalFormat("#.#");
		        return Double.valueOf(newFormat.format(value));
		 }


}
