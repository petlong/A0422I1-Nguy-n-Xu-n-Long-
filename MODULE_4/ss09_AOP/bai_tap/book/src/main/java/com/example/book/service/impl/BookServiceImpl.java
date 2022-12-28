package com.example.book.service.impl;

import com.example.book.model.Book;
import com.example.book.model.Card;
import com.example.book.repository.IBookRepository;
import com.example.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private IBookRepository iBookRepository;

    @Override
    public List<Book> findAll() {
        return iBookRepository.findAll();
    }

    @Override
    public void save(Book book) {
        iBookRepository.save(book);
    }

       @Override
    public Book findById(String id) {
        return iBookRepository.findById(id).orElse(null);
    }

    @Override
    public void updateAmountBook(String id, String option) {
        Book book = iBookRepository.findById(id).orElse(null);
        Long quantity = book.getAmount();
        if (option.equals("borrow"))
            book.setAmount(quantity - 1);
        else if (option.equals("give-back"))
            book.setAmount(quantity + 1);
        iBookRepository.save(book);
    }

    @Override
    public void updateAmount_book(String idBook) {
        iBookRepository.updateAmount_book(idBook);
    }

}
