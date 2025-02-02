/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author Sai Hari
 */
//Final class cannot be Inherited
public final class FinalDemo {

    //Final method cannot be overridden
    public static final int doubleCapacity(int capacity) {
        return capacity * 2;
    }

    public static void main(String[] args) {
        //Final Variable cannot be changed
        final int CAPACITY = 100;
        System.out.println("Doubled Capacity is : " + doubleCapacity(CAPACITY));
    }
}
