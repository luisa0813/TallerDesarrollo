package domain;

public abstract class Vehicle {
	protected String brand,model,reference;
	protected double price;

	protected Vehicle(String brand, String model, String reference, double price) {
		this.brand = brand;
		this.model = model;
		this.reference = reference;
		this.price = price;
	} 
	
	

	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public abstract void calculateFinalPrice();
	
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", reference=" + reference + "]";
	}

	
	
	
	
	
	
	
	
	
	
	

}
        