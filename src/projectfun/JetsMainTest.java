package projectfun;
import java.util.*;

public class JetsMainTest {		

	public static void main(String[] args) {
			// this is where the program actually runs through main. I      		tried to keep this as short as possible
		Scanner input = new Scanner(System.in);
		String fighters[] = { "Lockheed Martin F-22 Raptor", "Chengdu J-10", "Eurofighter Typhoon", "Lockheed Martin F-35 Lightning", "Dassault Rafale", "MiG 35", "Saab JAS 39 Gripen"};
		Jets info = new Jets();
	        info.playGame();
		}
	
	//I decided to instantiate 1 of my favorite fighter Jets around the world 
		Jetprice f22 = new Jetprice("F22-Raptor", 1497.5F, 2000.0F, 150_000_000 );
		
    //instantiated 6 other fighter Jets from around the world
		Jetprice j10 = new Jetprice("Chengdu J-10", 920.0F, 2112.6F, 110_000_000 );
		Jetprice etyphoon = new Jetprice("Eurofighter Typhoon", 1550.3F, 1801.9F, 118_000_000 );
		Jetprice f35 = new Jetprice("F-35 Lightning", 1499.0F, 2622.2F, 80_000_000 );
		Jetprice drafale = new Jetprice("Dassault Rafale", 1188.0F, 2299.0F, 89_000_000 );
		Jetprice mig35 = new Jetprice("MiG 35", 1491.3F, 1242.0F, 55_000_000 );
		Jetprice gripen = new Jetprice("JAS 39 Gripen", 1370.0F, 2019.0F, 60_000_000 );        
	

		private void playGame() {
			System.out.println("\t\tI love jets.");
			
		}
}
