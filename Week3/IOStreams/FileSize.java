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

public class FileSize {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Sai Hari\\Documents\\NetBeansProjects\\Week\\test\\Week3\\Sample.txt");

        if (file.exists()) {
            long bytes = file.length();
            double kilobytes = bytes / 1024.0;
            double megabytes = kilobytes / 1024.0;

            System.out.println("File size: " + bytes + " bytes");
            System.out.println("File size: " + kilobytes + " KB");
            System.out.println("File size: " + megabytes + " MB");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
