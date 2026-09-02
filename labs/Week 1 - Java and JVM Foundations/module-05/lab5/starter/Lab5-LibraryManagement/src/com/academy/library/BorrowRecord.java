package com.academy.library;

import java.time.LocalDate;

public class BorrowRecord {

    private final String bookId;
    private final String memberId;
    private final LocalDate borrowDate;
    private LocalDate returnDate;

    public BorrowRecord(String bookId, String memberId, LocalDate borrowDate) {
        this.bookId = bookId;
        this.memberId = memberId;
        this.borrowDate = borrowDate;
    }

    public String getBookId() {
        return bookId;
    }

    public String getMemberId() {
        return memberId;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void display() {
        String returned = returnDate == null ? "Not returned" : returnDate.toString();
        System.out.printf("Book: %s | Member: %s | Borrowed: %s | Returned: %s%n",
                bookId, memberId, borrowDate, returned);
    }
}
