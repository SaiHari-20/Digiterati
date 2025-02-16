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
import java.io.FilenameFilter;

public class FilterFilesByExtension {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\Sai Hari\\Documents\\NetBeansProjects\\Week\\test\\Week3\\Sample.txt");
        String extension = ".txt";  // Change this to the desired extension

        FilenameFilter filter = (dir, name) -> name.endsWith(extension);
        String[] files = directory.list(filter);

        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("No files found with the given extension.");
        }
    }
}
