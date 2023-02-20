package com.example.exam_v02.repository;

import com.example.exam_v02.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepository extends CrudRepository<Category, Long> {
}
