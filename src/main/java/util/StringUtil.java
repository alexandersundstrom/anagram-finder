package util;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

public class StringUtil {

    public static String sortStringAlphabetically(String word) {
        if (isNull(word)) {
            return null;
        }

        char[] wordArray = word.toCharArray();
        Arrays.sort(wordArray);
        return new String(wordArray);
    }

    public static Map<String, List<String>> getAllStringsContainingSameLetters(List<String> words, boolean ignoreCase) {
        HashMap<String, List<String>> map = new HashMap<>();
        if (isNull(words) || words.isEmpty()) {
            return map;
        }

        words.forEach(word -> {
            String sorted = sortStringAlphabetically(ignoreCase ? word.toLowerCase() : word);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        });
        return map
                .entrySet()
                .stream()
                .filter(stringListEntry -> stringListEntry.getValue().size() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
