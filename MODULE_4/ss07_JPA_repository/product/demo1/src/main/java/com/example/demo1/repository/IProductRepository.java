package com.example.demo1.repository;


import com.example.demo1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepository extends JpaRepository <Product,String> {
}
