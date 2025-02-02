package Week1;

public class StringProcessor {
	public String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	public int countOccurrences(String text, String sub) {
		int count = 0;
		int index = 0;
		while ((index = text.indexOf(sub, index)) != -1) {
			count++;
			index += sub.length();
		}
		return count;
	}
	public String splitAndCapitalize(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
            }
        }

        return result.toString().trim();
    }
	public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();
        
        System.out.println("Reversed: " + processor.reverseString("welcome"));

        System.out.println("Occurrences: " + processor.countOccurrences("ratata", "ta"));

        System.out.println("Capitalized: " + processor.splitAndCapitalize("entering into tech mahindra"));
    }
}
