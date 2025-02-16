/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Task1;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        // Original array with 10 elements
        int[] sourceArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Destination array of size 5
        int[] destinationArray = new int[5];

        // Copy a range of values (3 elements starting from index 2 of the source array)
        System.arraycopy(sourceArray, 2, destinationArray, 0, 3);

        // Output the destination array
        System.out.print("Destination array after copy: ");
        System.out.println(Arrays.toString(destinationArray));
    }
}
