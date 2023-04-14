
package domain;

public class AerialVehicule extends Vehicle {
	private String hasPermissionCA, registrationCertificate, typeUse;

	public AerialVehicule(String brand, String model, String reference, String hasPermissionCA,
			String registrationCertificate, String typeUse, double price) {
		super(brand, model, reference, price);
		this.hasPermissionCA = hasPermissionCA;
		this.registrationCertificate = registrationCertificate;
		this.typeUse = typeUse;
	}

	public String getHasPermissionCA() {
		return hasPermissionCA;
	}

	public void setHasPermissionCA(String hasPermissionCA) {
		this.hasPermissionCA = hasPermissionCA;
	}

	public String getRegistrationCertificate() {
		return registrationCertificate;
	}

	public void setRegistrationCertificate(String registrationCertificate) {
		this.registrationCertificate = registrationCertificate;
	}

	public String getTypeUse() {
		return typeUse;
	}

	public void setTypeUse(String typeUse) {
		this.typeUse = typeUse;
	}
	
	@Override
	public void calculateFinalPrice() {

	}

	@Override
	public String toString() {
		return "AerialVehicule [hasPermissionCA=" + hasPermissionCA + ", registrationCertificate="
				+ registrationCertificate + ", typeUse=" + typeUse + "]";
	}
	
	
	
	
	
	
	
	

	
	
	
	
	

}
