package util;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FileReaderTest {

    @Test
    public void readFromFile() {
        List<String> stringsFromFile = FileReader.getStringsFromFile("ordbok-less-utf8.txt");
        assertThat(stringsFromFile).isNotEmpty();
    }
}