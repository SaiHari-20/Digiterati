/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InventoryManagement;

/**
 *
 * @author Sai Hari
 */
class OutOfStockException extends Exception {

    public OutOfStockException(String message) {
        super(message);
    }
}

class InvalidLocationException extends Exception {

    public InvalidLocationException(String message) {
        super(message);
    }
}

public class Exceptions {
    //Dummy class
}
