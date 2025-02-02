/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author Sai Hari
 */
public class PrimitiveAndReference {

    public static void modify(int num, int arr[]) {

        // Modifying the integer(primitive)
        num = num + 10;

        // Modifying the array(reference)
        arr[0] = arr[0] + 10;
        System.out.println("Within the method num : " + num);
        System.out.println("Within the method arr[0]: " + arr[0]);
    }

    public static void main(String[] args) {
        int number = 5;
        int[] array = {1, 2, 3, 4, 5};
        modify(number, array);
        System.out.println("num :  " + number);
        System.out.println("arr[0] :  " + array[0]);
    }
}
