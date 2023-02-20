package com.example.exam1.service.impl;

import com.example.exam1.entity.Category;
import com.example.exam1.repository.ICategoryRepository;
import com.example.exam1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public List<Category> findAll() {
        return (List<Category>) iCategoryRepository.findAll();
    }
}
