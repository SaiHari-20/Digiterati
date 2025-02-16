/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Streams;

/**
 *
 * @author Sai Hari
 */
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6, 7);
        
        List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println("List without duplicates: " + uniqueNumbers);
    }
}
