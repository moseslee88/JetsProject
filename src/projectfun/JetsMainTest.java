package projectfun;

import java.util.*;

public class JetsMainTest {

	static Jetprice [] jetsss = new Jetprice[10];
	public static void main(String[] args) {
			// this is where the program actually runs through main. I      		tried to keep this as short as possible
		Scanner input = new Scanner(System.in);
		String fighters[] = { "Lockheed Martin F-22 Raptor", "Chengdu J-10", "Eurofighter Typhoon", "Lockheed Martin F-35 Lightning", "Dassault Rafale", "MiG 35", "Saab JAS 39 Gripen"};
	
	//I decided to load 1 of my favorite fighter Jets into jetsss array 
		jetsss[0] = new Jetprice("F22-Raptor", 1497.5F, 2000.0F, 150_000_000 );
		
    //loaded 6 other fighter Jets from around the world into array
		jetsss[1] = new Jetprice("Chengdu J-10", 920.0F, 2112.6F, 110_000_000 );
		jetsss[2] = new Jetprice("Eurofighter Typhoon", 1550.3F, 1801.9F, 118_000_000 );
		jetsss[3] = new Jetprice("F-35 Lightning", 1499.0F, 2622.2F, 80_000_000 );
		jetsss[4] = new Jetprice("Dassault Rafale", 1188.0F, 2299.0F, 89_000_000 );
		jetsss[5] = new Jetprice("MiG 35", 1491.3F, 1242.0F, 55_000_000 );
		jetsss[6] = new Jetprice("JAS 39 Gripen", 1370.0F, 2019.0F, 60_000_000 );   
		
		
	    int choice, i;
	    do {
	    System.out.println("\nWelcome to this fleet of Fighter Jets!");
	    System.out.println("Select an option: ");
	    System.out.println("1) List Fleet");
	    System.out.println("2) View the fastest fighter Jet");
	    System.out.println("3) View fighter Jet with longest range");
	    System.out.println("4) Add a Jet to the Fleet");
	    System.out.println("5) Quit");

	    choice = input.nextInt();

	    if(choice == 1) {   //lists all the jets in the Fleet
	    	Jetprice list = jetsss[0];
	    	list.viewlist(jetsss);
	    }
	    else if(choice == 2) {
	      Jetprice fast = jetsss[0]; 
	      for( i = 0; i < jetsss.length; i++){
	        if (jetsss[i] != null) {
	          if (jetsss[i].getMaxspeed() > fast.getMaxspeed()) {
	        	  fast = jetsss[i];
	          }
	        }
	      }
	          System.out.println("This is the fastest fighter jet: " + fast);
	    }   
	    else if(choice == 3) {
		    Jetprice longest = jetsss[0]; 
		    for( i = 0; i < jetsss.length; i++){
		        if (jetsss[i] != null) {
		          if (jetsss[i].getRange() > longest.getRange()) {
		        	  longest = jetsss[i];
		          }
		        }
		      }
	      System.out.println("This jet has longest range: " + longest); 
	    }
	    else if(choice == 4) {  //for adding a Jet
		    for( i = 0; i < jetsss.length; i++){
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
	      
	  } while(choice!=5);
	    System.out.println("You have succesfully quit the program!");
	}

}
