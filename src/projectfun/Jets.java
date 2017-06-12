package projectfun;

public class Jets {
	    protected String model;
	    protected Float maxspeed;
	    protected Float range;
	    

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public Float getMaxspeed() {
			return maxspeed * 0.00130332f;
		}

		public void setMaxspeed(Float maxspeed) {
			this.maxspeed = maxspeed * 0.00130332f;   //I googled how to convert speed in mph to Mach number
		}

		public Float getRange() {
			return range;
		}

		public void setRange(Float range) {
			this.range = range;
		}


		public Jets(String model, Float speed, Float range) {
			this.model = model;
			this.maxspeed = maxspeed * 0.00130332f;  
			this.range = range;
		}
		
		public Jets() {

		}
	}