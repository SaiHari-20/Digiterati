/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramFinder {

    public static List<Integer> findAnagrams(String text, String pattern) {
        List<Integer> result = new ArrayList<>();
        if (text.length() < pattern.length()) {
            return result;
        }

        int[] patternCount = new int[26];
        int[] windowCount = new int[26];
        
        //Count frequency of characters in pattern
        for (char c : pattern.toCharArray()) {
            patternCount[c - 'a']++;
        }

        int patternLength = pattern.length();

        for (int i = 0; i < text.length(); i++) {
            windowCount[text.charAt(i) - 'a']++;
            
            // Remove the character left out of the window
            if (i >= patternLength) {
                windowCount[text.charAt(i - patternLength) - 'a']--;
            }
            // Compare window with patternCount
            if (Arrays.equals(patternCount, windowCount)) {
                result.add(i - patternLength + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p)); // Output: [0, 6]
    }
}
