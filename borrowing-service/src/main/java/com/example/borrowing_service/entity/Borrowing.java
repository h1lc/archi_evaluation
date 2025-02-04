package com.example.borrowing_service.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Borrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long bookId;
    private Long userId;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Long getId()
    {
        return id;
    }

    public Long getbookId()
    {
        return bookId;
    }

    public Long getUserId()
    {
        return userId;
    }

    public LocalDate getBorrowDate()
    {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void SetId(Long id)
    {
        this.id = id;
    }

    public void SetBookId(Long BookId)
    {
        this.bookId = BookId;
    }

    public void SetUserId(Long UserId)
    {
        this.userId = UserId;
    }

    public void setBorrowDate(LocalDate date)
    {
        borrowDate = date;
    }

    public void setReturnDate(LocalDate date)
    {
        returnDate = date;
    }

}
