package domain;

public class MotorizedLandVehicle extends Vehicle {
	private String carType, tractionType;
	private double carTax;

	public MotorizedLandVehicle(String brand, String model, String reference, String carType, String tractionType,
			double carTax, double price) {
		super(brand, model, reference, price);
		this.carType = carType;
		this.tractionType = tractionType;
		this.carTax = carTax;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getTractionType() {
		return tractionType;
	}

	public void setTractionType(String tractionType) {
		this.tractionType = tractionType;
	}

	public double getCarTax() {
		return carTax;
	}

	public void setCarTax(double carTax) {
		this.carTax = carTax;
	}

	@Override
	public void calculateFinalPrice() {
	  	
		
		

	}

	@Override
	public String toString() {
		return "MotorizedLandVehicle [carType=" + carType + ", tractionType=" + tractionType + ", carTax=" + carTax
				+ "]";
	}

}
