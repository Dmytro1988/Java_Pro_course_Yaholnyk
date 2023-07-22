package app;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.*;

class FileLoggerTest {

    @Test
    public void testLog_infoMessage_logsToFile() throws IOException {

        File file = new File("log.txt");
        assertTrue(file.exists());
        String contents = Files.readAllLines(file.toPath()).get(0);
        assertEquals("2023-07-20 12:03:04.337 INFO Message: Це повідомлення для рівня DEBUG", contents);
    }

    @Test
    public void testLog_debugMessage_logsToFile() throws IOException {

        File file = new File("log.txt");
        assertTrue(file.exists());
        String contents = Files.readAllLines(file.toPath()).get(0);
        assertEquals("2023-07-20 12:03:04.337 INFO Message: Це повідомлення для рівня DEBUG", contents);
    }

    @Test
    public void testLog_messageWithTooLongString_throwsException() {

        FileLoggerConfiguration configuration = new FileLoggerConfiguration("log.txt", LoggingLevel.INFO,
                1000, "[%d-%m-%Y %H:%M:%S] Повідомлення: %s");
        FileLogger logger = new FileLogger(configuration);

        String message = "This is a message that is too long.";
        try {
            logger.log(LoggingLevel.INFO, message);
        } catch (FileMaxSizeReachedException e) {

            assertEquals("File size reached max size: 1000, current size: 1032, path: log.txt", e.getMessage());
        }

    }
}