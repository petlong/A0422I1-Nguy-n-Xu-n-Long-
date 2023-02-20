package com.example.exam_v02.service;

import com.example.exam_v02.entity.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    Category findById(Long id);
}
