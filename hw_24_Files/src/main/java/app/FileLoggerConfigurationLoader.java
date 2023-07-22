package app;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLoggerConfigurationLoader {
    private static final String FILE_KEY = "FILE";
    private static final LoggingLevel LEVEL_KEY = LoggingLevel.valueOf("LEVEL");
    private static final String MAX_SIZE_KEY = "MAX-SIZE";
    private static final String FORMAT_KEY = "FORMAT";

    public static FileLoggerConfiguration load(String path) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(path));

        String file = properties.getProperty(FILE_KEY);
        LoggingLevel level = LoggingLevel.valueOf(properties.getProperty(String.valueOf(LEVEL_KEY)));
        Integer maxSize = Integer.parseInt(properties.getProperty(MAX_SIZE_KEY));
        String format = properties.getProperty(FORMAT_KEY);

        return new FileLoggerConfiguration(file, level, maxSize, format);
    }

}
