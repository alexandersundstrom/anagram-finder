import util.AnagramUtil;
import util.FileReader;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.joining;

public class Main {

    public static void main(String[] args) {
        List<String> strings = FileReader.getStringsFromFile("ordbok-utf8.txt");
        Map<String, List<String>> anagrams = AnagramUtil.getAllWordsContainingSameLetters(strings, false);

        anagrams.forEach((key, words) -> {
            String anagramWords = words
                    .stream()
                    .collect(joining(" "));
            System.out.println(anagramWords);
        });
    }
}
