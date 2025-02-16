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

public class ReadFileExample {
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + fileName);
        }
        System.out.println("File found: " + fileName);
    }

    public static void main(String[] args) {
        try {
            readFile("Sample.txt"); // Provide a file path
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
