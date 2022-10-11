import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCalculator {

    /**
     * Get the frequency of words in {@code text} in descending order.
     * @param text to get the word frequency of.
     * @return {@link Map} of frequency of words in descending order.
     */
    public static Map<String, Integer> getSortedWordFrequency(String text) {
        String[] words = text.split(" ");

        Map<String, Integer> wordFrequencies = new HashMap<>();

        for (String word : words) {
            wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
        }

        // Sort map by value
        Map<String, Integer> sortedWordFrequencies = wordFrequencies.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        return sortedWordFrequencies;
    }

    /**
     * Prints the word and frequency of that word.
     * @param wordFrequencies {@link Map} of {@code wordFrequencies}
     */
    public static void printWordFrequencies(Map<String, Integer> wordFrequencies){
        wordFrequencies.forEach((key, value) -> System.out.println(value + " " + key));
    }
}
