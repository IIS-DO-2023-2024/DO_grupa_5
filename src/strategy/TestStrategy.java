package strategy;

public class TestStrategy {

	public static void main(String[] args) {
		ShoppingCart studentShoppingCart = new ShoppingCart(new StudentDiscount());
		ShoppingCart pensionersShoppingCart = new ShoppingCart(new PensionersDiscount());
		
		double amount = 100;
		System.out.println("Regularna cena je: " + amount + " RSD");
		
		double studentAmount = studentShoppingCart.calculateTotal(amount);
		System.out.println("Studentska cena: " + studentAmount + " RSD");
		
		double pensionersAmount = pensionersShoppingCart.calculateTotal(amount);
		System.out.println("Cena za penzionere je: " + pensionersAmount + " RSD");
		
		// BuffredWriter - klasa u jeziku Java koja omogućava pisanje podataka u tok podataka (stream) - upis u tekstualnu datotek (.txt)
		// ObjectOutputStream - klasa u jeziku Java koja omogućava pisanja objekata u tok podataka (stream) - kreiranje crteža (.bin)
	}

}
