import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {
    public static int[] countWordsByLength(String text) {
        int[] sizes = new int[20];
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String foundWord = matcher.group();
            int length = foundWord.length();

            if (length < sizes.length) {
                sizes[length]++;
            }
        }

        return sizes;
    }
}