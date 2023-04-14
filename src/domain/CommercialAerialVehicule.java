package domain;

public class CommercialAerialVehicule extends AerialVehicule {
	private double discount;

	public CommercialAerialVehicule(String brand, String model, String reference, String hasPermissionCA,
			String registrationCertificate, String typeUse, double price, double discount) {
		super(brand, model, reference, hasPermissionCA, registrationCertificate, typeUse, price);
		this.discount = discount;
	}



	public double getDiscount() {
		return discount;
	}



	public void setDiscount(double discount) {
		this.discount = discount;
	}



	@Override
	public void calculateFinalPrice() {

	}

	@Override
	public String toString() {
		return "CommercialAerialVehicule [discount=" + discount + "]";
	}
	
	
	
	
	

}
