package util;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AnagramUtilTest {

    @Test
    public void getAnagramNonCaseSensitive() {
        List<String> one = List.of("hej", "Hej", "Lars", "Larsa");
        Map<String, List<String>> anagrams = AnagramUtil.getAllWordsContainingSameLetters(one, false);
        assertThat(anagrams.isEmpty()).isTrue();
    }

    @Test
    public void getAnagramCaseSensitive() {
        List<String> one = List.of("hej", "Hej", "Lars", "Larsa");
        Map<String, List<String>> anagrams = AnagramUtil.getAllWordsContainingSameLetters(one, true);
        assertThat(anagrams.isEmpty()).isFalse();
        assertThat(anagrams.size()).isEqualTo(1);
        assertThat(anagrams.get("ehj")).isNotNull();
    }
}