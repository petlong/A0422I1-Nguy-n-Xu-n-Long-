package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService{
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public void create(Blog blog) {
        Date date = new Date();
        blog.setDatePublish(date);
        iBlogRepository.save(blog);
    }

//    @Override
//    public void update(String id, Blog blog) {
//        Blog blog1 = findById(id);
//        iBlogRepository.save(blog1);
//    }

    @Override
    public void update(Blog blog) {
        Date date = new Date();
        blog.setDatePublish(date);
        iBlogRepository.save(blog);
    }

    @Override
    public void delete(String id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public Blog findById(String id) {
        return iBlogRepository.findById(id).orElse(null);
    }

    @Override
    public List<Blog> findAllByNameContaining(String name) {
        return iBlogRepository.findAllByNameContaining(name);
    }

    @Override
    public List<Blog> findByCategoryName(String name) {
        return iBlogRepository.findByCategoryName(name);
    }

    @Override
    public Page<Blog> findAllWithPagingAndSort(Pageable pageable) {
        return iBlogRepository.findAll(pageable);
    }

}
