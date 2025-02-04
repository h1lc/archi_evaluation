package com.example.borrowing_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.borrowing_service.entity.Borrowing;
import com.example.borrowing_service.service.BorrowingService;

@RestController
@RequestMapping("/borrowing")
public class BorrowingController {
    @Autowired
    private BorrowingService borrowingService;

    

    @DeleteMapping("/{id}")
    public void deleteBorrowing(@PathVariable Long id) {
        borrowingService.deleteBorrowing(id);;
    }

    @GetMapping
    public List<Borrowing> getAllBooks() {
        return borrowingService.getAllBorrowing();
    }

    @GetMapping("/{id}")
    public Borrowing getBorrowingbyID(@PathVariable Long id) {
        return borrowingService.getBorrowingbyId(id);
    }


}
