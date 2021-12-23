package com.s7.demo.book.controller;

import com.s7.demo.book.message.BookResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping(value = "/books/{number}")
    public BookResponse getBook(@PathVariable(name = "number") String number) {
//        todo implement getting book from database
        return null;
    }

//    todo implement creation book

}