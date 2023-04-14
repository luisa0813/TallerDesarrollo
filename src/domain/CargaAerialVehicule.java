package domain;

public class CargaAerialVehicule  extends AerialVehicule{
	private double capacityKilograms;

	public CargaAerialVehicule(String brand, String model, String reference, String hasPermissionCA,
			String registrationCertificate, String typeUse, double capacityKilograms, double price) {
		super(brand, model, reference, hasPermissionCA, registrationCertificate, typeUse, price);
		this.capacityKilograms = capacityKilograms;
	}

	public double getCapacityKilograms() {
		return capacityKilograms;
	}

	public void setCapacityKilograms(double capacityKilograms) {
		this.capacityKilograms = capacityKilograms;
	}
	
	@Override
	public void calculateFinalPrice() {

	}

	@Override
	public String toString() {
		return "CargaAerialVehicule [capacityKilograms=" + capacityKilograms + "]";
	}
	
	
	

}
