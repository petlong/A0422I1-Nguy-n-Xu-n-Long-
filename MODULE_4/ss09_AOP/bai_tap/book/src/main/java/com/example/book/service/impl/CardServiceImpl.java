package com.example.book.service.impl;

import com.example.book.model.Book;
import com.example.book.model.Card;
import com.example.book.repository.ICardRepository;
import com.example.book.service.IBookService;
import com.example.book.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CardServiceImpl implements ICardService {
    @Autowired
    private ICardRepository iCardRepository;

    @Autowired
    private IBookService bookService;
    @Override
    public List<Card> findAll() {
        return iCardRepository.findAll();
    }

    @Override
    public void save(Card card) {
        bookService.updateAmountBook(card.getBook().getId(), "borrow");
        iCardRepository.save(card);
    }

    @Override
    public Card findById(Integer idCard) {
        return iCardRepository.findCardById(idCard);
    }

    @Override
    public void deleteById(Integer id) {
        iCardRepository.deleteById(id);
    }

    @Override
    public int deleteByCardId(String id, Integer idCard) {
        return deleteByCardId(id, idCard);
    }

    @Override
    public boolean remove(Card card, Integer idCard) {
        int b = iCardRepository.deleteByCardId(card.getBook().getId() , idCard);
        if (b == 0)
            return false;
        else
            bookService.updateAmountBook(card.getBook().getId(), "give-back");
        return true;
    }
}
