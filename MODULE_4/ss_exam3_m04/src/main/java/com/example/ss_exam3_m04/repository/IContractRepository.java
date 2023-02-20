package com.example.exam_v02.repository;

import com.example.exam_v02.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
    //search nhiều trường
//    Page<Product> findAllByNameContainingOrIdCardContainingOrPhoneContaining(String name, String idCard, String phone, Pageable pageable);

//    @Query("select c from Customer as c where c.name like %:search% or c.idCard like %:search%")
//    Page<Customer> findAllCustomerWithPagingAndSortAndSearch(String search, Pageable pageable);

    // search 1 trường
    Page<Product> findAllByNameContaining(String name, Pageable pageable);

    //tạo String Id tăng tự động
//    Product findTopByOrderByIdDesc();
}
