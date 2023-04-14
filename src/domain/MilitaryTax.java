package domain;

public class MilitaryTax extends AerialVehicule{
	private double militaryTax;

	

	public MilitaryTax(String brand, String model, String reference, String hasPermissionCA,
			String registrationCertificate, String typeUse, double price, double militaryTax) {
		super(brand, model, reference, hasPermissionCA, registrationCertificate, typeUse, price);
		this.militaryTax = militaryTax;
	}

	public double getMilitaryTax() {
		return militaryTax;
	}

	public void setMilitaryTax(double militaryTax) {
		this.militaryTax = militaryTax;
	}
	
	
	@Override
	public void calculateFinalPrice() {

	}

	@Override
	public String toString() {
		return "MilitaryTax [militaryTax=" + militaryTax + "]";
	}
	
	
	

}
