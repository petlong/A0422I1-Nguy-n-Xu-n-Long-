package com.example.blogexpanse.repository;

import com.example.blogexpanse.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Long> {

    @Query(value = "select b from Blog as b where b.categoryName.categoryName = :name", nativeQuery = false)
    List<Blog> findAllByCategoryName(@Param("name") String categoryName);

    @Query(value = "select b from Blog as b where b.contentSummary like %:contentSummary%", nativeQuery = false)
    Page<Blog> findAllByContentSummary(String contentSummary, Pageable pageable);
}
