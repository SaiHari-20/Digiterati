package Week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
	public static List<Integer> findAnagrams(String text, String pattern) {
    List<Integer> result = new ArrayList<>();
    if (text.length() < pattern.length()) return result;

    int[] patternCount = new int[26];
    int[] windowCount = new int[26];

    for (char c : pattern.toCharArray()) {
        patternCount[c - 'a']++;
    }

    int patternLength = pattern.length();

    for (int i = 0; i < text.length(); i++) {
        windowCount[text.charAt(i) - 'a']++;

        if (i >= patternLength) {
            windowCount[text.charAt(i - patternLength) - 'a']--;
        }

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
