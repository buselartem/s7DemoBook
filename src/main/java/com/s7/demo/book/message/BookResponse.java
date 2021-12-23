package com.s7.demo.book.message;

import com.s7.demo.book.model.Book;

public class BookResponse {

    private Book book;

    public BookResponse() {
    }

    public BookResponse(Book book) {
        this.book = book;
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}