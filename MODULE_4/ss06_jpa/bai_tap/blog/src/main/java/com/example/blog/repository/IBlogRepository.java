package com.example.blog.repository;

import com.example.blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog,String> {
//    @Query(value ="select  s from blog as s where s.name like :name" ,nativeQuery = false)
//    List<Blog> findAllByNameContaining(@Param("name") String name);

}
