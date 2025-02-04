package com.example.book_service.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.book_service.entity.book;

public interface bookRepositiory extends JpaRepository<book, Long> {

    List<book>getByBookId(Long id);

}
