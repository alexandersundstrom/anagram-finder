package util;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class FileReaderTest {

    @Test
    public void readFromFile() {
        List<String> stringsFromFile = FileReader.getStringsFromFile("ordbok-utf8.txt");
        Assertions.assertThat(stringsFromFile).isNotEmpty();
    }


}