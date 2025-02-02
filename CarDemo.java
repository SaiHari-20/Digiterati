/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author Sai Hari
 */
public class CarDemo {
    public static void main(String[] args) {
        //Array of Car objects (both Car and ElectricCar)
        Car[] cars = {new Car("Mahindra", "Thar", 2010), new ElectricCar("Mahindra", "BE 6", 2024, 400),
            new Car("Tata", "Punch", 2021), new ElectricCar("Tata", "Curruv", 2024, 250)};

        //Loop through the array and call startEngine() on each object
        for (Car car : cars) {
            car.startEngine();
        }
    }
}
