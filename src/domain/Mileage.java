package domain;

public class Mileage extends MotorizedLandVehicle {
	private int milage;

	public Mileage(String brand, String model, String reference, String carType, String tractionType, double carTax,
			int milage, double price) {
		super(brand, model, reference, carType, tractionType, carTax, price);
		this.milage = milage;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}
	
	@Override
	public void calculateFinalPrice() {

	}

	@Override
	public String toString() {
		return "Mileage [milage=" + milage + "]";
	}
	

}
