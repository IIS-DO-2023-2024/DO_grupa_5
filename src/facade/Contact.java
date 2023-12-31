package facade;

public class Contact {
	private Car car;
	private String carKey;
	private String message;
	
	public Contact(Car car, String carKey) {
		this.car = car;
		this.carKey = carKey;
	}

	public String getMessage() {
		return message;
	}
	
	public boolean giveContact() {
		if(car.getCarKey() == carKey) {
			message = "brmbrmbrm.";
			return true;
		}
		
		message = "Wrong key.";
		return false;
	}

}