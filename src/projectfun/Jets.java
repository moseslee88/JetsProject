package projectfun;

public class Jets {
	    protected String model;
	    protected Float speed;
	    protected Float range;

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public Float getSpeed() {
			return speed;
		}

		public void setSpeed(Float speed) {
			this.speed = speed;
		}

		public Float getRange() {
			return range;
		}

		public void setRange(Float range) {
			this.range = range;
		}


		public Jets(String model, Float speed, Float range) {
			this.model = model;
			this.speed = speed;  
			this.range = range;
		}
		
		public Jets() {

		}
	}
	
	
	
