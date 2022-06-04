package com.poc.feign.http.client;

import com.poc.feign.domain.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "library-management-ms", url = "http://localhost:9000/v1/books")
public interface BookClient {

    @GetMapping("/{bookId}")
    @ResponseBody
    Book getBook(@PathVariable String bookId);
}
