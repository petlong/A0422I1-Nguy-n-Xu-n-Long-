package com.example.book.service;

import com.example.book.model.Book;
import com.example.book.model.Card;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
    void save(Book book);
//    void delete(String id);
    Book findById(String id);
    void updateAmountBook(String id, String option);

    void updateAmount_book(String idBook);

}
