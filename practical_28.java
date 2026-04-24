import java.io.*;

public class FileStats {
    public static void main(String[] args) {
        BufferedReader reader = null;

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            reader = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;

                // Count words
                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }

                // Count characters (excluding spaces)
                for (int i = 0; i < line.length(); i++) {
                    if (!Character.isWhitespace(line.charAt(i))) {
                        charCount++;
                    }
                }
            }

            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces & newlines): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File 'data.txt' not found.");
        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
