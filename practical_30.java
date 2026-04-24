import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Create HashMap
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Split sentence into words
        String[] words = input.split("\\s+");

        // Count frequency of each word
        for (String word : words) {
            word = word.trim();

            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Display results
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        scanner.close();
    }
}
