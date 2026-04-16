import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a single letter: ");
        char ch = scanner.next().charAt(0);

        // Convert to lowercase for case-insensitive comparison
        ch = Character.toLowerCase(ch);

        // Check if it's a letter
        if (Character.isLetter(ch)) {
            // Check vowel or consonant
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("It is a vowel.");
            } else {
                System.out.println("It is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a letter.");
        }

        scanner.close();


output:
Enter a single letter: A
It is a vowel.

Enter a single letter: b
It is a consonant.

Enter a single letter: 5
Invalid input. Please enter a letter.
    }
}
