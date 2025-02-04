package com.example.borrowing_service.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.borrowing_service.entity.Borrowing;
import com.example.borrowing_service.repository.BorrowingRepository;
import com.example.borrowing_service.service.BorrowingService;

@Service
public class BorrowingServiceimpl implements BorrowingService {

    @Autowired
    private BorrowingRepository borrowingRepository;
        public List<Borrowing> getAllBorrowing()
        {
            return borrowingRepository.findAll();
        }

    public Borrowing getBorrowingbyId(Long id) {
        return borrowingRepository.findById(id).orElseThrow(() -> new RuntimeException("Card not found"));
    }

    public void deleteBorrowing(Long id) {
        borrowingRepository.deleteById(id);
    }
}
