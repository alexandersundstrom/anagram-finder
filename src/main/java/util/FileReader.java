package util;

import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

import static java.util.Objects.isNull;

public class FileReader {

    public static List<String> getStringsFromFile(String filename) {
        if (isNull(filename)) {
            throw new IllegalArgumentException("Filename cannot be null");
        }

        //TODO Check if file exists

        InputStream fileStream = ClassLoader.getSystemResourceAsStream(filename);
        List<String> strings = IOUtils.readLines(fileStream, Charset.defaultCharset());

        return strings.stream()
                .filter(string -> !string.isBlank())
                .toList();
    }
}
