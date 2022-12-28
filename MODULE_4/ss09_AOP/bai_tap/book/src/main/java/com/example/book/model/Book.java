package com.example.book.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "book")
public class Book {
    @Id
    @Column(name = "book_id", columnDefinition = "VARCHAR(50)")
    private String id;

    @Column(name = "book_name", columnDefinition = "VARCHAR(50)")
    private String name;

    @Column(name = "book_amount")
    private Long amount;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
    private Set<Card> cards;

    public Book() {
    }

    public Book(String name, Long amount, Set<Card> cards) {
        this.name = name;
        this.amount = amount;
        this.cards = cards;
    }

    public Book(String id, String name, Long amount, Set<Card> cards) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.cards = cards;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Card> getCards() {
        return cards;
    }

    public void setCards(Set<Card> cards) {
        this.cards = cards;
    }
}
