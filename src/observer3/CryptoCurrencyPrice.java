package observer3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CryptoCurrencyPrice {
	private double bitcoinPrice;
	private double etherPrice;
	private PropertyChangeSupport support;
	
	
	public void setBitcoinPrice(double bitcoinPrice) {
		support.firePropertyChange("bitcoin", this.bitcoinPrice, bitcoinPrice);
		this.bitcoinPrice = bitcoinPrice;
	}

	public void setEtherPrice(double etherPrice) {
		support.firePropertyChange("ether", this.etherPrice, etherPrice);
		this.etherPrice = etherPrice;
	}

	public CryptoCurrencyPrice() {
		support = new PropertyChangeSupport(this);
	}
	
	public void addListener(PropertyChangeListener listener) {
		support.addPropertyChangeListener(listener);
	}
	
	public void removeListener(PropertyChangeListener listener) {
		support.removePropertyChangeListener(listener);
	}
	

}
