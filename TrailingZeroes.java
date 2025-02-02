/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import java.util.*;

/**
 *
 * @author Sai Hari
 */
public class TrailingZeroes {

    //Method to count no. of trailing zeroes
    public static int countTrailingZeroes(int num) {
        int noOfZeros = 0;
        for (int i = 5; i <= num; i *= 5) {
            noOfZeros += num / i;
        }
        return noOfZeros;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Number of Trailing Zeroes in" + num + "!" + countTrailingZeroes(num));
    }
}
