package builder2;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
	private String bread;
	private List<String> spreads;
	private List<String> meats;
	private List<String> salads;
	
	// nije nazgodnije rešenje, jer nismo obuhvatili sve slučajeva => builder, unutrašnje klase
//	public Sandwich(String bread, String spread, String meat, String salad) {
//		this.bread = bread;
//		spreads.add(spread);
//		meats.add(meat);
//		salads.add(salad);
//	}
	
	public Sandwich(Builder builder) {
		bread = builder.bread;
		spreads = builder.spreads;
		meats = builder.meats;
		salads = builder.salads;
	}

	
	@Override
	public String toString() {
		return "Sandwich [bread=" + bread + ", spreads=" + spreads + ", meats=" + meats + ", salads=" + salads + "]";
	}


	// unutrašnja klasa mora biti static
	public static class Builder {
		private String bread;
		private List<String> spreads;
		private List<String> meats;
		private List<String> salads;
		
		public Builder(String bread) {
			this.bread = bread;
			spreads = new ArrayList<String>();
			meats = new ArrayList<String>();
			salads = new ArrayList<String>();
		}

		public Builder spread(String spread) {
			spreads.add(spread);
			return this;
		}
		
		public Builder meat(String meat) {
			meats.add(meat);
			return this;
		}
		
		public Builder salad(String salad) {
			salads.add(salad);
			return this;
		}
		
		public Sandwich build() {
			return new Sandwich(this);
		}
		
		
	}

}
