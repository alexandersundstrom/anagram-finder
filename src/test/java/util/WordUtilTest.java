package util;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WordUtilTest {


    @Test
    public void sortStringsAlphabetically() {
        String hello = "hello";
        String sorted = WordUtil.sortStringAlphabetically(hello);
        assertThat(sorted).isEqualTo("ehllo");

        String casedString = "HelLo";
        String sortedCased = WordUtil.sortStringAlphabetically(casedString);
        assertThat(sortedCased).isEqualTo("HLelo");
    }
}