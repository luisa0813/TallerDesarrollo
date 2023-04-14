package domain;

public class HumanPoweredeVehicule extends Vehicle {
	private String enverionmentalSubsidy;

	

	public HumanPoweredeVehicule(String brand, String model, String reference, double price,
			String enverionmentalSubsidy) {
		super(brand, model, reference, price);
		this.enverionmentalSubsidy = enverionmentalSubsidy;
	}

	public String getEnverionmentalSubsidy() {
		return enverionmentalSubsidy;
	}

	public void setEnverionmentalSubsidy(String enverionmentalSubsidy) {
		this.enverionmentalSubsidy = enverionmentalSubsidy;
	}

	@Override
	public void calculateFinalPrice() {
		

	}

	@Override
	public String toString() {
		return "HumanPoweredeVehicule [brand=" + brand + ", model=" + model + ", reference=" + reference + "]";
	}

}
