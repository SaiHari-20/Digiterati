/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.ExceptionHandling;

/**
 *
 * @author Sai Hari
 */
import java.io.*;
import java.util.*;

class PositiveNumberException extends Exception {

    public PositiveNumberException(String message) {
        super(message);
    }
}

public class ReadNumbersFromFile {

    public static void checkNumbers(String fileName) throws IOException, PositiveNumberException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num > 0) {
                scanner.close();
                throw new PositiveNumberException("Positive number found: " + num);
            }
        }
        scanner.close();
        System.out.println("No positive numbers found in the file.");
    }

    public static void main(String[] args) {
        try {
            checkNumbers("numbers.txt"); // Provide a file path
        } catch (IOException | PositiveNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
