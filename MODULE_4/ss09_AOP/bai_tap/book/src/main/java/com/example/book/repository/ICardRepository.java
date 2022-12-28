package com.example.book.repository;

import com.example.book.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//@Transactional
@Repository
public interface ICardRepository extends JpaRepository<Card,Integer> {
    @Query(value = "delete from card as c where c.book.id =?1 and c.id =?2", nativeQuery = false)
    int deleteByCardId(String id, Integer idCard);

//    @Query(value = "select c.id from card c where c.id =?1", nativeQuery = false)
    Card findCardById(Integer idCard);
}
