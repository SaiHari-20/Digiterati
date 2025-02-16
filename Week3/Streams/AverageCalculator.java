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
import java.util.Arrays;

public class AverageCalculator {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int average = numbers.stream().reduce(0, (a, b) -> a + b) / numbers.size();
        System.out.println("Average: " + average);
    }
}
