package Week1;

public class Car {
	
	//private instance variables
	private String make;
	private String model;
	private int year;
	
    //Constructor
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
    //Getters and Setters
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
    
	public void startEngine() {
		System.out.println(this.make + " "+ this.model+" "+"Engine has started");
	}
}
