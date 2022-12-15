package com.example.blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "blog")
public class Blog {
    //    @Id
//    //tự động tăng
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "blog_id", columnDefinition = "VARCHAR(50)")
    private String id;

    @Column(name = "blog_name", columnDefinition = "VARCHAR(50)")
    private String name;

    @Column (name = "blog_text")
    private String text;

    public Blog() {
    }

    public Blog(String id, String name, String text) {
        this.id = id;
        this.name = name;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
