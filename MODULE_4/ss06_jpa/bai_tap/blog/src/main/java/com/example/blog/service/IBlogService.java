package com.example.blog.service;

import com.example.blog.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    void create(Blog blog);
//    void update(String id, Blog blog);
    void update(String id, Blog blog);
//    void update(Blog blog);
    void delete(String id);
    Blog findById(String id);
}
