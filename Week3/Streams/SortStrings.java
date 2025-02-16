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
import java.util.Comparator;

public class SortStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "cherry", "date");

        List<String> ascendingOrder = words.stream().sorted().collect(Collectors.toList());
        List<String> descendingOrder = words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("Sorted in ascending order: " + ascendingOrder);
        System.out.println("Sorted in descending order: " + descendingOrder);
    }
}
