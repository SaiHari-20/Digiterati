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

public class CheckFileType {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Sai Hari\\Documents\\NetBeansProjects\\Week\\test\\Week3\\Sample.txt");

        if (file.isDirectory()) {
            System.out.println("It is a directory.");
        } else if (file.isFile()) {
            System.out.println("It is a file.");
        } else {
            System.out.println("It is neither a file nor a directory.");
        }
    }
}
