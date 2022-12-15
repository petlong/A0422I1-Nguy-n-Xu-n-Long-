package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService{
    private IBlogRepository iBlogRepository;

    @Autowired
    public BlogServiceImpl (IBlogRepository iBlogRepository){
        this.iBlogRepository = iBlogRepository;
    }

    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public void create(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void update(String id, Blog blog) {
        Blog blog1 = findById(id);
        iBlogRepository.save(blog1);
    }

//    @Override
//    public void update(Blog blog) {
//        iBlogRepository.save(blog);
//    }

    @Override
    public void delete(String id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public Blog findById(String id) {
        return iBlogRepository.findById(id).orElse(null);
    }
}
