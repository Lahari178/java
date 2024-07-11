package Interface;

import java.io.FileWriter;
import java.io.IOException;

interface Logger {
    void log(String message);

    default void defaultLog() {
        System.out.println("Logging default message");
    }
}

class FileLogger implements Logger {
    private String filename;

    public FileLogger(String filename) {
        this.filename = filename;
    }

    public void log(String message) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}

class ConsoleLogger implements Logger {
   
    public void log(String message) {
        System.out.println("Console Log: " + message);
    }
}

public class Logger1 {
    public static void main(String[] args) {
        Logger fileLogger = new FileLogger("log.txt");
        fileLogger.log("This is a file log message.");
        fileLogger.defaultLog();
        Logger consoleLogger = new ConsoleLogger();
        consoleLogger.log("This is a console log message.");
        consoleLogger.defaultLog();
    }
}
