package com.example.blog.model;

import javax.persistence.*;
import java.util.Set;

@Entity (name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "category_id")
    private Integer id;
    private String name;
    @OneToMany (mappedBy = "category")
    private Set<Blog> blogs;

    public Set<Blog> getBlogs() {
        return blogs;
    }

    public Category(Integer id, String name, Set<Blog> blogs) {
        this.id = id;
        this.name = name;
        this.blogs = blogs;
    }

    public void setBlogs(Set<Blog> blogs) {
        this.blogs = blogs;
    }

    public Category() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
