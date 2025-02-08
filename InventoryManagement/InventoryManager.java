/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InventoryManagement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;

public class InventoryManager {

    private ConcurrentHashMap<String, Product> products;
    private PriorityBlockingQueue<Order> orderQueue;

    public InventoryManager() {
        products = new ConcurrentHashMap<>();
        orderQueue = new PriorityBlockingQueue<>(10, new OrderComparator());
    }

    public synchronized void addProduct(Product product) {
        products.put(product.getProductID(), product);
        System.out.println("Product added: " + product.getName());
    }

    public synchronized void updateStock(String productID, int quantity) throws OutOfStockException {
        Product product = products.get(productID);
        if (product == null || product.getQuantity() < quantity) {
            throw new OutOfStockException("Product " + productID + " is out of stock or does not exist.");
        }
        product.setQuantity(product.getQuantity() - quantity);
        System.out.println("Stock updated for product: " + productID);
    }

    public void processOrders() {
        while (!orderQueue.isEmpty()) {
            Order order = orderQueue.poll();
            new Thread(() -> fulfillOrder(order)).start();
        }
    }

    private void fulfillOrder(Order order) {
        try {
            for (String productID : order.getProductIDs()) {
                updateStock(productID, 1); // Assuming 1 unit per product in the order
            }
            System.out.println("Order " + order.getOrderID() + " fulfilled.");
        } catch (OutOfStockException e) {
            System.err.println("Error fulfilling order " + order.getOrderID() + ": " + e.getMessage());
        }
    }

    public void addOrder(Order order) {
        orderQueue.add(order);
        System.out.println("Order added: " + order.getOrderID());
    }
}
