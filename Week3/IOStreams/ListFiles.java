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

public class ListFiles {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\Sai Hari\\Documents\\NetBeansProjects\\Week\\test\\Week3\\Sample.txt");
        String[] files = directory.list();
        
        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("Directory does not exist or is empty.");
        }
    }
}
