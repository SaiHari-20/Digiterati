/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import Utility.Constants;
import java.util.Scanner;

/**
 *
 * @author Sai Hari
 */
public class Divide {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        //Check whether divided by zero or not
        if (number2 == 0) {
            System.out.println(Constants.ZERO_EXCEPTION);
        } //Check whether numerator is less than denominator
        else if (number1 < number2) {
            System.out.println("Quotient is : " + 0 + "\n" + "Remainder is : " + number1);
        } else {
            divide(number1, number2);
        }

    }
    //Method to divide two numbers

    private static void divide(int number1, int number2) {
        int quotient = 0;
        int remainder;
        //Check whether numerator is greater than or equal to denominator
        while (number1 >= number2) {
            number1 -= number2;
            quotient++;

        }
        remainder = number1;
        System.out.println("Quotient is : " + quotient + "\n" + "Remainder is : " + remainder);
    }
}
