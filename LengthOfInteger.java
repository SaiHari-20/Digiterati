/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import Utility.Utility;
import java.util.Scanner;

/**
 *
 * @author Sai Hari
 */
public class LengthOfInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // Call the static method from the Utility class and print length
        System.out.println("Length:" + Utility.getLength(number));
    }
}
