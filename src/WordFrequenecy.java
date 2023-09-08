import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordFrequenecy {

    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordOccurrences = new HashMap<>();
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String foundWord = matcher.group().toLowerCase();
            int count = wordOccurrences.getOrDefault(foundWord, 0); // Use getOrDefault to handle non-existent keys
            wordOccurrences.put(foundWord, count + 1);
        }

        return wordOccurrences;
    }
}
