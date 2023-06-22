package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
    private static Logger instance;
    private File logFile;

    private Logger() {
        try {
            this.logFile = new File("log.txt");
            if (!logFile.exists()) {
                logFile.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        try {
            FileWriter writer = new FileWriter(logFile, true);
            writer.write(new Date().toString() + ": " + message + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clear() {
        logFile.delete();
    }
}