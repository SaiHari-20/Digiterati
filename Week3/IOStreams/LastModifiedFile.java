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
import java.util.Date;

public class LastModifiedFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Sai Hari\\Documents\\NetBeansProjects\\Week\\test\\Week3\\Sample.txt");
        
        if (file.exists()) {
            System.out.println("Last modified date: " + new Date(file.lastModified()));
        } else {
            System.out.println("File does not exist.");
        }
    }
}
