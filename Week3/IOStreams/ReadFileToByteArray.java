/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.IOStreams;

/**
 *
 * @author Sai Hari
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ReadFileToByteArray {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Sai Hari\\Documents\\NetBeansProjects\\Week\\test\\Week3\\Sample.txt");

        if (file.exists()) {
            byte[] fileBytes = Files.readAllBytes(file.toPath());
            System.out.println("File content in bytes: " + fileBytes.length);
        } else {
            System.out.println("File does not exist.");
        }
    }
}
