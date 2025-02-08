/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InventoryManagement;

import java.util.List;
import java.util.Comparator;

/**
 *
 * @author Sai Hari
 */
import java.util.List;

public class Order {

    private String orderID;
    private List<String> productIDs;
    private Priority priority;

    public Order(String orderID, List<String> productIDs, Priority priority) {
        this.orderID = orderID;
        this.productIDs = productIDs;
        this.priority = priority;
    }

    // Getters
    public String getOrderID() {
        return orderID;
    }

    public List<String> getProductIDs() {
        return productIDs;
    }

    public Priority getPriority() {
        return priority;
    }

    public enum Priority {
        STANDARD, EXPEDITED
    }
}

class OrderComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        return o2.getPriority().compareTo(o1.getPriority()); // Higher priority first
    }
}
