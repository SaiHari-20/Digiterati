/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InventoryManagement;

/**
 *
 * @author Sai Hari
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        System.out.println("Inventory Manager initialized.");

        // Initialize inventory
        Product product1 = new Product("P1", "Laptop", 10, new Location(1, 2, 3));
        Product product2 = new Product("P2", "Smartphone", 20, new Location(2, 3, 4));
        inventoryManager.addProduct(product1);
        inventoryManager.addProduct(product2);

        // Create orders
        Order order1 = new Order("O1", Arrays.asList("P1", "P2"), Order.Priority.EXPEDITED);
        Order order2 = new Order("O2", Collections.singletonList("P1"), Order.Priority.STANDARD);
        inventoryManager.addOrder(order1);
        inventoryManager.addOrder(order2);

        // Process orders
        inventoryManager.processOrders();

        System.out.println("Order processing completed.");
    }
}
