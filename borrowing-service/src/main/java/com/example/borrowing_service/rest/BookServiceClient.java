package com.example.borrowing_service.rest;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class BookServiceClient {
    private final RestTemplate restTemplate;
    private final String bookServiceUrl = "http://book-sercice/book";

    @Autowired
    public BookServiceClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

     public boolean bookisAvailable(Long bookId) {
        try {
            ResponseEntity<Boolean> response = restTemplate.getForEntity(bookServiceUrl + bookId, Boolean.class);
            return response.getBody();
        } catch (HttpClientErrorException.NotFound e) {
            return false;
        }
    }

}
