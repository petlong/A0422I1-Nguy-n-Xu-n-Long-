package com.example.book.repository;

import com.example.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public interface IBookRepository extends JpaRepository<Book,String> {
    @Modifying
    @Query("update book b set b.amount  = b.amount - 1 where b.id = :idBook ")
    void updateAmount_book(@Param("idBook") String idBook);

}

