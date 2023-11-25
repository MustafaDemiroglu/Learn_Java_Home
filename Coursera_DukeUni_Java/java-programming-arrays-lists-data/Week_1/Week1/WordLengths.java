
/**
 * Beschreiben Sie hier die Klasse WordLengths.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

    import edu.duke.*;

public class WordLengths {
    
    public void countWordLengths(FileResource resource, int[] counts) {
        for (String word : resource.words()) {
            int wordLength = 0;

            // Remove non-letter characters from the start
            int startIndex = 0;
            while (startIndex < word.length() && !Character.isLetter(word.charAt(startIndex))) {
                startIndex++;
            }

            // Remove non-letter characters from the end
            int endIndex = word.length() - 1;
            while (endIndex >= 0 && !Character.isLetter(word.charAt(endIndex))) {
                endIndex--;
            }

            // Calculate word length considering only letters
            for (int i = startIndex; i <= endIndex; i++) {
                wordLength++;
            }

            // Update counts array for the word length
            if (wordLength >= counts.length) {
                counts[counts.length - 1]++; // Words longer than counts array size
            } else if (wordLength > 0) {
                counts[wordLength]++;
            }
        }
    }
    
    public void testCountWordLengths() {
        FileResource resource = new FileResource(); // Prompt to select a file
        int[] counts = new int[31]; // Array to store word counts
        countWordLengths(resource, counts); // Count word lengths

        for (int i = 1; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println(counts[i] + " words of length " + i + ":");
                printWordsOfLength(resource, i); // Print words of specific length
            }
        }

        // Find the most common word length
        int mostCommonLength = indexOfMax(counts);
        System.out.println("Most common word length: " + mostCommonLength);
    }
    
    private void printWordsOfLength(FileResource resource, int length) {
        for (String word : resource.words()) {
            if (getWordLength(word) == length) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
    }
    
    private int getWordLength(String word) {
        int wordLength = 0;

        int startIndex = 0;
        while (startIndex < word.length() && !Character.isLetter(word.charAt(startIndex))) {
            startIndex++;
        }

        int endIndex = word.length() - 1;
        while (endIndex >= 0 && !Character.isLetter(word.charAt(endIndex))) {
            endIndex--;
        }

        for (int i = startIndex; i <= endIndex; i++) {
            wordLength++;
        }

        return wordLength;
    }

    // ... (other methods remain the same)


    public int indexOfMax(int[] values) {
        int maxIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > values[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
