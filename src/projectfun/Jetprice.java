package projectfun;


public class Jetprice extends Jets {
		protected int price;
	


		public Jetprice(String model, Float speed, Float range, int price) {
			this.model = model;
			this.speed = speed;  
			this.range = range;
			this.price = price;
		}
		
		public Jetprice() {
			
		}
		
		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
		//  calculateRegistrationFee()
	//	public static Double calculateRegistrationFee() {
		//	double fee = 0.01;
		//	return fee;
	//	}
//		returns a double. The fee should be 1% of the purchase price, less .01% for each yearthatthevehicleisold,butnolessthan 5%ofthepurchaseprice. (Hint:Youcanretrievethe current year by calling java.time.Year.now().getValue()).
		
		@Override
		public String toString() {
			return "FighterJet [Model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
		}
		


		}
