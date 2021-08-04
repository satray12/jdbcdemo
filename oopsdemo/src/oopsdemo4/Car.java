package oopsdemo4;

//Car-->NewCarModel-->Maruti-->Audi-->CarDemo
public class Car {
	
	String company;
	 boolean isAutomatic;
	 String modelName;
	 float highTechAC;
	 String color;
	 String fuelType;
	 String power;
	 int numberOfGear;
	 
	public Car(String company, boolean isAutomatic, String modelName, float highTechAC, String color, String fuelType,
			String power, int numberOfGear) {
		this.company = company;
		this.isAutomatic = isAutomatic;
		this.modelName = modelName;
		this.highTechAC = highTechAC;
		this.color = color;
		this.fuelType = fuelType;
		this.power = power;
		this.numberOfGear = numberOfGear;
	}

	public String getCompany() {
		return company;
	}

	public boolean isAutomatic() {
		return isAutomatic;
	}
	
	public String getModelName() {
		return modelName;
	}

	public float getHighTechAC() {
		return highTechAC;
	}

	public String getColor() {
		return color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public String getPower() {
		return power;
	}

	public int getNumberOfGear() {
		return numberOfGear;
	}
 

}
