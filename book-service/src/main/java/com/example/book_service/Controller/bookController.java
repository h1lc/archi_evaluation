package com.example.book_service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.book_service.entity.book;
import com.example.book_service.service.BookService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/book")
public class bookController {
    @Autowired
    private BookService bookservice;

    @PostMapping
    public book addBook(@RequestBody book _book) {
        
        return bookservice.addBook(_book);
    }

    @PostMapping("/borrow")
    public void borrowBook(@RequestBody Long id) {

        bookservice.borrowBook(id);
    }
    

    @DeleteMapping("/{id}")
    public void deletebook(@PathVariable Long id) {
        bookservice.deleteBook(id);
    }

    @GetMapping
    public List<book> getAllBooks() {
        return bookservice.getAllBooks();
    }

    @GetMapping("/{id}")
    public book getBookbyID(@PathVariable Long id) {
        return bookservice.getBookbyId(id);
    }

    @GetMapping("/id}/getAvaibility{")
    public boolean getAvaibility(@PathVariable Long id) {
        return bookservice.isAvailable(id);
    }


    
}
