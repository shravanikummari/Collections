package uniquewordscounter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class UniqueWordsCounter {
    private Set<String> uniqueWords;
    public UniqueWordsCounter(){
        uniqueWords =new HashSet<>();
    }
    public void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    // Remove punctuation marks and convert to lowercase for simplicity
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                    if (!word.isEmpty()) {
                        uniqueWords.add(word);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public int getUniqueWordCount() {
        return uniqueWords.size();
    }

    public void displayUniqueWords() {
        System.out.println("Unique Words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
    public static void main(String[] args) {
        UniqueWordsCounter counter = new UniqueWordsCounter();
        String filePath = "sample.txt";

        counter.readFile(filePath);

        counter.displayUniqueWords();
        System.out.println("\nTotal unique words: " + counter.getUniqueWordCount());
    }
}
