import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String text1 = "To be, or not to be: that is the question:";
        int[] letterOccurrences = LetterCounter.countLetters(text1);
        System.out.println("Letter Occurrences:");
        for (int i = 0; i < letterOccurrences.length; i++) {
            char letter = (char) (i + 'a');
            System.out.println("Char " + letter + " freq = " + letterOccurrences[i]);
        }


        String text2 = "Whether 'tis nobler in the mind to suffer";
        int[] wordSizes = WordCounter.countWordsByLength(text2);
        System.out.println("\nWord Sizes:");
        for (int i = 1; i < wordSizes.length; i++) {
            System.out.println("Words of length " + i + " = " + wordSizes[i]);
        }
        String text = "To be, or not to be: that is the question:\nWhether 'tis nobler in the mind to suffer";

        Map<String, Integer> wordOccurrences = WordFrequenecy.countWords(text);
        System.out.println("Word Occurrences:");
        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println("Word '" + word + "' occurs " + count + " times");
        }




    }
}