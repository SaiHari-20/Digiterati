/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InventoryManagement;

/**
 *
 * @author Sai Hari
 */
public class Location {

    private int aisle;
    private int shelf;
    private int bin;

    public Location(int aisle, int shelf, int bin) {
        this.aisle = aisle;
        this.shelf = shelf;
        this.bin = bin;
    }

    // Getters
    public int getAisle() {
        return aisle;
    }

    public int getShelf() {
        return shelf;
    }

    public int getBin() {
        return bin;
    }

    @Override
    public String toString() {
        return "Aisle: " + aisle + ", Shelf: " + shelf + ", Bin: " + bin;
    }
}
