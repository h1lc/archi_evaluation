package com.example.borrowing_service.service;

import java.util.List;

import com.example.borrowing_service.entity.Borrowing;

public interface BorrowingService {
    public List<Borrowing> getAllBorrowing();

 //   public Borrowing addBorrowing();

    public Borrowing getBorrowingbyId(Long id);

    public void deleteBorrowing(Long id);
}
