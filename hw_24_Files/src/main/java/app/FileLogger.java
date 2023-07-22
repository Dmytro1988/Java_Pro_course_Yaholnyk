package app;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileLogger {
    private final FileLoggerConfiguration config;


    public FileLogger(FileLoggerConfiguration config) {
        this.config = config;
    }

    void log(LoggingLevel level, String message) {

        if (!Files.exists(Paths.get(config.getFile()))) {
            try {
                Files.createFile(Paths.get(config.getFile()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        if (level.equals(LoggingLevel.INFO) || level.equals(LoggingLevel.DEBUG)) {

            String log = String.format("%s %s Message: %s ", DateTransfer.convert(), level, message);

            if (config.getMaxSize() > 0 && log.length() > config.getMaxSize()) {
                throw new FileMaxSizeReachedException(config.getMaxSize(), log.length(), config.getFile());
            }

            try {
                FileWriter writer = new FileWriter(config.getFile(), true);
                writer.write(log);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

                System.out.println(log);

        }
    }

}
            
            
            
        
    

        
    


