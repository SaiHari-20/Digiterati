/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.ExceptionHandling;

/**
 *
 * @author Sai Hari
 */
class OddNumberException extends Exception {

    public OddNumberException(String message) {
        super(message);
    }
}

public class CheckEvenNumber {

    public static void checkEven(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number is odd: " + num);
        }
        System.out.println("Number is even: " + num);
    }

    public static void main(String[] args) {
        try {
            checkEven(5); // This will throw an exception
        } catch (OddNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
