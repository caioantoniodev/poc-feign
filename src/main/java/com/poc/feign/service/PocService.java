package com.poc.feign.service;

import com.poc.feign.domain.Book;
import com.poc.feign.http.client.BookClient;
import org.springframework.stereotype.Service;

@Service
public class PocService {

    private final BookClient bookClient;

    public PocService(BookClient bookClient) {
        this.bookClient = bookClient;
    }
    public Book getBook(String bookId) {

        return bookClient.getBook(bookId);
    }
}
