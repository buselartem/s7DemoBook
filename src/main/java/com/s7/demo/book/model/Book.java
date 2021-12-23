package com.s7.demo.book.model;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {

    @Id
    @SequenceGenerator(name = "seq_book_pk", sequenceName = "seq_book_pk", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "seq_book_pk")
    @Column(unique = true, nullable = false, updatable = false)
    public Long id;

    @Column(name = "number")
    public String number;

    @Column(name = "name")
    public String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}