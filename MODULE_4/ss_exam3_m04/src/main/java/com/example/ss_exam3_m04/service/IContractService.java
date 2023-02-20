package com.example.exam_v02.service;

import com.example.exam_v02.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    void save(Product product);

    void delete(Long id);

    List<Product> findAll();

    Product findById(Long id);

    // phân trang
    Page<Product> findAllWithPagingAndSort(Pageable pageable);

    // search và phân trang
    Page<Product> findAllWithPagingAndSortAndSearch(String search, Pageable pageable);

//    Page<Product> findAllByNameContainingOrIdCardContainingOrPhoneContaining(String name, Pageable pageable);
}
