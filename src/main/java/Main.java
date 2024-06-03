import util.FileReaderUtil;
import util.StringUtil;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.joining;

public class Main {

    public static void main(String[] args) {
        List<String> strings = FileReaderUtil.getStringsFromFile("ordbok-utf8.txt");
        Map<String, List<String>> anagrams = StringUtil.getAllStringsContainingSameLetters(strings, false);

        anagrams.forEach((key, words) -> {
            String anagramWords = words
                    .stream()
                    .collect(joining(" "));
            System.out.println(anagramWords);
        });
    }
}
