package com.example.blog.service;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    void create(Blog blog);
//    void update(String id, Blog blog);
    void update(Blog blog);
    void delete(String id);
    Blog findById(String id);
    List<Blog> findAllByNameContaining(String name);
    List<Blog> findByCategoryName (String name);
    Page<Blog> findAllWithPagingAndSort(Pageable pageable);
}
