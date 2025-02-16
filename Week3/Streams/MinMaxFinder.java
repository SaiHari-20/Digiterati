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
import java.util.Optional;
import java.util.Arrays;
import java.util.Comparator;

public class MinMaxFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 5, 40, 15);

        Optional<Integer> max = numbers.stream().max(Comparator.naturalOrder());
        Optional<Integer> min = numbers.stream().min(Comparator.naturalOrder());

        System.out.println("Maximum value: " +max);
        System.out.println("Minimum value: " +max);
    }
}
