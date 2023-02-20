package com.furamam04.repository;

import com.furamam04.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    Page<Customer> findAllByNameContainingOrIdCardContainingOrPhoneContaining(String name, String idCard, String phone, Pageable pageable);

//    @Query("select c from Customer as c where c.name like %:search% or c.idCard like %:search%")
//    Page<Customer> findAllCustomerWithPagingAndSortAndSearch(String search, Pageable pageable);
}
