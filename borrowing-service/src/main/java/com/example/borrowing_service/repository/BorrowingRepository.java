package com.example.borrowing_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.borrowing_service.entity.Borrowing;

public interface BorrowingRepository extends JpaRepository<Borrowing, Long>{
    List<Borrowing>findbyUserId(Long UserId);
}
