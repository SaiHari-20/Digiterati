/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Task1;

import java.util.Arrays;

/**
 *
 * @author Sai Hari
 */
public class Task3 {

    public static void main(String[] args) {

        // Using equals() for simple objects
        String str1 = "TechM";
        String str2 = "TechM";

        System.out.println("Using equals() on strings: " + str1.equals(str2));  // true

        // Using equals() for arrays 
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 3};
        System.out.println("Using equals() on arrays: " + Arrays.equals(arr1, arr2));  // false

        // Using deepEquals() for arrays
        System.out.println("Using deepEquals() on arrays: " + Arrays.deepEquals(arr1,arr2));  // true

        // Nested arrays with deepEquals
        int[][] nestedArr1 = {{1, 2}, {3, 4}};
        int[][] nestedArr2 = {{1, 2}, {3, 4}};
        System.out.println("Using deepEquals() on nested arrays: " + Arrays.deepEquals(nestedArr1, nestedArr2));  // true

    }

}
