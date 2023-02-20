package com.example.exam1.repository;

import com.example.exam1.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepository extends CrudRepository<Category,Long> {
}
