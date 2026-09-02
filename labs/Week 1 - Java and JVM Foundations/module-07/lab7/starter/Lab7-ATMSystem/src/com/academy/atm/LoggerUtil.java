package com.academy.atm;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public final class LoggerUtil {

    private static final Path LOG_PATH = Path.of("logs", "application.log");
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private LoggerUtil() {
    }

    public static void logInfo(String message) {
        writeLog("INFO", message, null);
    }

    public static void logError(String message, Throwable throwable) {
        writeLog("ERROR", message, throwable);
    }

    public static void logTransaction(String message, long executionTimeMillis) {
        writeLog("INFO", message + " | Execution Time: " + executionTimeMillis + " ms", null);
    }

    private static void writeLog(String level, String message, Throwable throwable) {
        try {
            Files.createDirectories(LOG_PATH.getParent());
            StringBuilder entry = new StringBuilder();
            entry.append(LocalDateTime.now().format(FORMATTER))
                    .append(" ")
                    .append(level)
                    .append(" ")
                    .append(message);

            if (throwable != null) {
                entry.append(System.lineSeparator())
                        .append(throwable.getClass().getSimpleName())
                        .append(" ")
                        .append(throwable.getMessage())
                        .append(System.lineSeparator())
                        .append(Arrays.toString(throwable.getStackTrace()));
            }

            entry.append(System.lineSeparator());
            Files.writeString(LOG_PATH, entry.toString(),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException ioException) {
            System.err.println("Unable to write log file: " + ioException.getMessage());
        }
    }
}
