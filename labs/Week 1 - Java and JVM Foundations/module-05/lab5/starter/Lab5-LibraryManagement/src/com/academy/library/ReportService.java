package com.academy.library;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class ReportService {

    private final LibraryService libraryService;

    public ReportService(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    public void displaySummaryReport() {
        // TODO: compute totalBooks, borrowedBooks, availableBooks, totalMembers
        // TODO: findMostPopularCategory(); print Reports block matching solution format
        throw new UnsupportedOperationException("TODO");
    }

    public Path exportReportToFile(String fileName) throws IOException {
        // Bonus / full-path feature — implement after core borrow/return/summary TODOs.
        System.out.println("Bonus / full-path feature — implement after core TODOs.");
        return Path.of(fileName);
    }

    private String findMostPopularCategory() {
        // TODO: max entry by value from getCategoryBookCount(); orElse "N/A"
        throw new UnsupportedOperationException("TODO");
    }
}
