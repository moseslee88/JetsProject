package projectfun;

import java.util.Scanner;

public class Hanger {

	public static void addjet(Jetprice[] jetsss) {
		Scanner input = new Scanner(System.in);
		
		for( int i = 0; i < jetsss.length; i++){
	        if (jetsss[i] != null) {
	        	System.out.println("Model: ");
	        	String model = input.next();
	        	System.out.println("Speed in miles per hour: ");
	        	float maxspeed = input.nextFloat();
	        	System.out.println("Range in miles: ");
	        	float range = input.nextFloat();
	        	System.out.println("Price of Jet: ");
	        	int price = input.nextInt();
	        	System.out.println("Congratulations. List Fleet to see new jet details");
				jetsss[i] = new Jetprice(model, maxspeed, range, price);
				break;
	        }
		
	}
	}		
}
