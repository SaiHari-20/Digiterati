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

public class CountStartingLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "avocado");

        char specificLetter = 'a';
        long count = words.stream().filter(word -> word.startsWith(String.valueOf(specificLetter))).count();

        System.out.println("Count of words starting with '" + specificLetter + "': " + count);
    }
}
