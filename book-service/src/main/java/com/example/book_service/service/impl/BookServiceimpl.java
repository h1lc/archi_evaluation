package com.example.book_service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book_service.entity.book;
import com.example.book_service.service.BookService;
import com.example.book_service.service.repository.bookRepositiory;

import java.util.List;

@Service
public class BookServiceimpl implements BookService {

    @Autowired
    private bookRepositiory _bookRepository;

    public List<book> getAllBooks() {
        return _bookRepository.findAll();
    }

    public book addBook(book _book) {
        return _bookRepository.save(_book);
    }

    public book getBookbyId(Long id)
    {
        return _bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public void deleteBook(Long id) {
        _bookRepository.deleteById(id);
    }

    public void borrowBook(Long id) {
       book _book = getBookbyId(id);
       _book.setAvaibility(false);
    }

}
