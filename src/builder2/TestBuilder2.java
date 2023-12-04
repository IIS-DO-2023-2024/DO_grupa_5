package builder2;

public class TestBuilder2 {

	public static void main(String[] args) {
		Sandwich.Builder builder = new Sandwich.Builder("Integralna");
		
		builder.spread("urnebes").spread("majonez").meat("šunka").salad("zelena").spread("pavlaka").salad("paradajz");
		
		Sandwich sandwich = builder.build();
		System.out.println(sandwich);
	}

}
