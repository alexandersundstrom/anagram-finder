package util;

import java.util.Arrays;

import static java.util.Objects.isNull;

public class WordUtil {

    public static String sortStringAlphabetically(String word) {
        if (isNull(word)) {
            return null;
        }

        char[] wordArray = word.toCharArray();
        Arrays.sort(wordArray);
        return new String(wordArray);
    }
}
