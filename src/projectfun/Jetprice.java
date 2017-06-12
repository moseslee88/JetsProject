package projectfun;


public class Jetprice extends Jets {
		protected int price;  
	

		public Jetprice(String model, Float maxspeed, Float range, int price) {
			this.model = model;
			this.maxspeed = maxspeed * 0.00130332f;  //I Googled the conversion rate between mph and Mach number  
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
				
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Model: ");
			builder.append(model);
			builder.append("\nSpeed in Mach(sound): ");
			builder.append(maxspeed);
			builder.append("\nRange: ");
			builder.append(range);
			builder.append("\nPrice: ");
			builder.append(price + ".00");
			return builder.toString();
//			return "FighterJet [Model=" + model + ", Max speed=" + maxspeed + ", range=" + range + ", price=" + price + "]";
		}

		public void viewlist(Jetprice[] jetsss) {
	    	for (int i = 0; i < jetsss.length; i++ ) {
	    	  if (jetsss[i] != null) {
	    		  System.out.println(jetsss[i] );
	    	  }
	      }
			
		}
		
		}
