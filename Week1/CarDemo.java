package Week1;

public class CarDemo {
	public static void main(String[] args) {

		// Creating an array of Car objects (polymorphism)

		Car[] cars = {new Car("Mahindra", "Thor", 2010),new ElectricCar("Tesla", "Model S", 2024, 400),
				new Car("Honda", "Civic", 2022), new ElectricCar("Nissan", "Leaf", 2023, 250) };

		// Looping through the array and calling startEngine() method

		for (Car car : cars) {
			car.startEngine();
		}

	}

}
