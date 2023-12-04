package builder1;

public class CapricciosaBuilder implements PizzaBuilder {
	
	private Pizza pizza;
	
	public CapricciosaBuilder() {
		pizza = new Pizza();
	}

	@Override
	public void putDough() {
		pizza.setDough("Klasično");

	}

	@Override
	public void putSauce() {
		pizza.setSauce("Paradjz sos");

	}

	@Override
	public void putCheese() {
		pizza.setCheese("Mozzarella");

	}

	@Override
	public void putMeat() {
		pizza.setMeat("Šunka");

	}

	@Override
	public Pizza getPizza() {
		return this.pizza;
	}

}
