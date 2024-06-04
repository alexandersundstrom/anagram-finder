package util;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringUtilTest {


    @Test
    public void sortStringsAlphabetically() {
        String hello = "hello";
        String sorted = StringUtil.sortStringAlphabetically(hello);
        assertThat(sorted).isEqualTo("ehllo");

        String casedString = "HelLo";
        String sortedCased = StringUtil.sortStringAlphabetically(casedString);
        assertThat(sortedCased).isEqualTo("HLelo");
    }

    @Test
    public void handleNullWord() {
        assertThat(StringUtil.sortStringAlphabetically(null)).isNull();
    }

    @Test
    public void getAnagramNonCaseSensitive() {
        List<String> one = List.of("hej", "Hej", "Lars", "Larsa");
        Map<String, List<String>> anagrams = StringUtil.getAllStringsContainingSameLetters(one, false);
        assertThat(anagrams.isEmpty()).isTrue();
    }

    @Test
    public void getAnagramCaseSensitive() {
        List<String> one = List.of("hej", "Hej", "Lars", "Larsa");
        Map<String, List<String>> anagrams = StringUtil.getAllStringsContainingSameLetters(one, true);
        assertThat(anagrams.isEmpty()).isFalse();
        assertThat(anagrams.size()).isEqualTo(1);
        assertThat(anagrams.get("ehj")).isNotNull();
        assertThat(anagrams.get("ehj").size()).isEqualTo(2);
        assertThat(anagrams.get("ehj").contains("hej")).isTrue();
        assertThat(anagrams.get("ehj").contains("Hej")).isTrue();
    }

    @Test
    public void handleNullAndEmptyList() {
        assertThat(StringUtil.getAllStringsContainingSameLetters(null, false).isEmpty()).isTrue();
        assertThat(StringUtil.getAllStringsContainingSameLetters(List.of(), false).isEmpty()).isTrue();
    }
}