import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterCounter {
    public static int[] countLetters(String text) {
        int[] occurrences = new int[26];
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            char current = Character.toLowerCase(matcher.group().charAt(0));
            int index = current - 'a';
            occurrences[index]++;
        }

        return occurrences;
    }
}
