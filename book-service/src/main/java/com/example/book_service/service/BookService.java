package com.example.book_service.service;

import java.util.List;

import com.example.book_service.entity.book;

public interface BookService {

    public book getBookbyId(Long id);

    public book addBook(book _book);

    public void deleteBook(Long id);

    public List<book> getAllBooks();
    
    public void borrowBook(Long id);

    public boolean isAvailable(Long id);

}
