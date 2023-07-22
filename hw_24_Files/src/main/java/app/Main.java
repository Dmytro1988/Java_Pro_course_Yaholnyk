package app;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileLoggerConfiguration configuration = new FileLoggerConfiguration("log.txt", LoggingLevel.INFO,
                1000, "[%d-%m-%Y %H:%M:%S] Повідомлення: %s");


        FileLogger logger = new FileLogger(configuration);

        try {

        logger.log(LoggingLevel.INFO,"Це повідомлення для рівня DEBUG\n");
        logger.log(LoggingLevel.DEBUG,"Це повідомлення для рівня INFO\n");

        } catch (FileMaxSizeReachedException e) {
            System.out.println(e.getMessage());
        }

//        FileLoggerConfiguration configuration = FileLoggerConfigurationLoader.load("config.txt");
//        FileLogger logger = new FileLogger(configuration);
//
//        logger.log(LoggingLevel.INFO, "Це повідомлення для рівня DEBUG\n");
//        logger.log(LoggingLevel.DEBUG, "Це повідомлення для рівня INFO\n");
    }


}



