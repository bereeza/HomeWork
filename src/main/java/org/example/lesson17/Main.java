package org.example.lesson17;

import org.example.lesson17.Log.LoggingLevel;
import org.example.lesson17.fileLog.FileLogger;
import org.example.lesson17.fileLog.FileLoggerConfiguration;
import org.example.lesson17.fileLog.FileLoggerConfigurationLoader;
import org.example.lesson17.stdoutLog.StdoutLogger;
import org.example.lesson17.stdoutLog.StdoutLoggerConfiguration;
import org.example.lesson17.stdoutLog.StdoutLoggerConfigurationLoader;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("test.txt");
        // create config and use INFO lvl
        // if I use config lvl info and use logger.debug --> throw exception IncorrectConfigException,
        // file didn't create
        FileLoggerConfiguration configuration = new FileLoggerConfiguration(LoggingLevel.INFO, file);
        FileLogger logger = new FileLogger(configuration);

        // I create 15 msg "TEST MSG"
        // FileLoggerConfiguration have 100 size for file
        // if > fileConfig.size --> create new file and write information
        // or uncomment FileMaxSizeReachedException and get exception
        for (int i = 0; i < 15; i++) {
            logger.info("TEST MSG");
        }

//        LVL: INFO
//        FORMAT: [2023-10-14T10:46:33.162587500][INFO]
//        FILE: C:\Users\User\IdeaProjects\HomeWork\Log_2023-10-14T10_46_33_178101400.txt
//        MAX-SIZE: 100
        FileLoggerConfigurationLoader loader = new FileLoggerConfigurationLoader();
        System.out.println(loader.load(configuration));

        // task 2
        // choose correct config and fun for logger1
        // if lvl info ==> logger1.info
        // if lvl debug ==> logger1.debug
        // or you get exception
        StdoutLoggerConfiguration configuration1 = new StdoutLoggerConfiguration(LoggingLevel.DEBUG);
        StdoutLogger logger1 = new StdoutLogger(configuration1);

//        [2023-10-14T10:54:46.850290][DEBUG][INFO]TEST MSG
//        [2023-10-14T10:54:46.851290700][DEBUG][INFO]TEST MSG
//        [2023-10-14T10:54:46.851290700][DEBUG][INFO]TEST MSG
//        [2023-10-14T10:54:46.851290700][DEBUG][INFO]TEST MSG
//        and other
        for (int i = 0; i < 15; i++) {
            logger1.debug("TEST MSG");
        }

//        LVL: DEBUG
//        FORMAT: [2023-10-14T10:54:46.849170900][DEBUG][INFO]
        StdoutLoggerConfigurationLoader loader1 = new StdoutLoggerConfigurationLoader();
        System.out.println(loader1.load(configuration1));

    }
}
