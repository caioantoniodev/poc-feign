package com.poc.feign.http;

import com.poc.feign.domain.Book;
import com.poc.feign.service.PocService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class PocController {

    private final PocService pocService;

    public PocController(PocService pocService) {
        this.pocService = pocService;
    }

    @GetMapping("/books/{bookId}")
    public ResponseEntity<Book> getBook(@PathVariable String bookId) {
        return ResponseEntity.ok(pocService.getBook(bookId));
    }
}
