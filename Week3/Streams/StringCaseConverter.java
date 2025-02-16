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

public class StringCaseConverter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");
        
        List<String> upperCaseWords = words.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        List<String> lowerCaseWords = words.stream()
                                           .map(String::toLowerCase)
                                           .collect(Collectors.toList());

        System.out.println("Uppercase: " + upperCaseWords);
        System.out.println("Lowercase: " + lowerCaseWords);
    }
}
