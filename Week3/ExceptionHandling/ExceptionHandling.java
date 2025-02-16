/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.ExceptionHandling;

/**
 *
 * @author Sai Hari
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            int result = 69 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        }
    }
}
