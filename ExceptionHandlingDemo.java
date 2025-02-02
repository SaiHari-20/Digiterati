/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import java.util.Scanner;

/**
 *
 * @author Sai Hari
 */
public class ExceptionHandlingDemo {

    public static void processInput() {
        //Try with resources
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            double number = scanner.nextDouble();

            //Checking if the number is zero to avoid division by zero
            if (number == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            //Calculating Reciprocal
            double reciprocal = 1 / number;
            System.out.println("Reciprocal :" + reciprocal);

        } catch (ArithmeticException e) {

            //Handling division by zero
            System.out.println("Error :" + e.getMessage());

        } finally {

            System.out.println("Process completed");
        }
    }

    public static void main(String[] args) {
        //Calling the method
        processInput();
    }
}
