/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;
import Utility.*;
/**
 *
 * @author Sai Hari
 */
public class Car {
    private String make;
    private String model;
    private int year;

    //Constructor
    public Car(String make, String model, int year) {
        super();
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

    public void setModel(String modal) {
        this.model = modal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Method to Start Engine
    public void startEngine() {
        System.out.println(make + " " + model + " " + Constants.START_ENGINE);
    }
}
