package com.example.book.model;

import javax.persistence.*;

@Entity (name = "card")
public class Card {
    @Id
    @Column(name = "card_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "book_id" , referencedColumnName = "book_id")
    private Book book;

    public Card() {
    }

    public Card(Book book) {
        this.book = book;
    }

    public Card(Integer id, Book book) {
        this.id = id;
        this.book = book;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
