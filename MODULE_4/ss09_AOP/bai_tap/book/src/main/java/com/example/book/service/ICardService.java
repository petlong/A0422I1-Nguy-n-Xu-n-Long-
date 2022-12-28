package com.example.book.service;

import com.example.book.model.Book;
import com.example.book.model.Card;

import java.util.List;

public interface ICardService {
    List<Card> findAll();
    void save(Card card);
    Card findById(Integer id);
    void deleteById(Integer id);
    int deleteByCardId(String id, Integer idCard);
    boolean remove(Card card, Integer idCard);
}
