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

public class CheckFileExists {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Sai Hari\\Documents\\NetBeansProjects\\Week\\test\\Week3\\Sample.txt");

        if (file.exists()) {
            System.out.println("File or directory exists.");
        } else {
            System.out.println("File or directory does not exist.");
        }
    }
}
