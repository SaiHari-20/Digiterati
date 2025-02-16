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

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}

public class CheckEmptyFile {
    public static void checkFile(String fileName) throws IOException, EmptyFileException {
        File file = new File("Sample.txt");
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + fileName);
        }
        if (file.length() == 0) {
            throw new EmptyFileException("File is empty: " + fileName);
        }
        System.out.println("File is not empty: " + fileName);
    }

    public static void main(String[] args) {
        try {
            checkFile("sample.txt"); // Provide a file path
        } catch (IOException | EmptyFileException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
