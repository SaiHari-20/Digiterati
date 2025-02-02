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
public class ElectricCar extends Car {

    public int batteryRange;

    //Constructor
    public ElectricCar(String make, String model, int year, int batteryRange) {
        super(make, model, year);
        this.batteryRange = batteryRange;

    }

    public int getBatteryRange() {
        return batteryRange;
    }

    public void setBatteryRange(int batteryRange) {
        this.batteryRange = batteryRange;
    }

    //ChargeBattery method
    public void chargeBattery() {
        System.out.println(getMake() + " " + getModel() + " " + Constants.CHARGE_BATTERY);
    }

    //Overriding startEngine method
    @Override
    public void startEngine() {
        System.out.println(getMake() + " " + getModel() + " " + Constants.START_ELECTRIC_ENGINE);
    }
}
