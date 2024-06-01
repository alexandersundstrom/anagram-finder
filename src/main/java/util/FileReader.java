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
        return IOUtils.readLines(fileStream, Charset.defaultCharset());
    }
}
