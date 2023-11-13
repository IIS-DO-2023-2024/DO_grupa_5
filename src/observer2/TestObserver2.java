package observer2;

public class TestObserver2 {

	public static void main(String[] args) {
		CryptoCurrencyPrice cp = new CryptoCurrencyPrice();
		CryptoCurrencyUpdateSMS cSMS = new CryptoCurrencyUpdateSMS();
		
		cp.addObserver(cSMS);
		
		cp.setBitcoinPrice(25000);
		cp.setEtherPrice(12000);

	}

}
