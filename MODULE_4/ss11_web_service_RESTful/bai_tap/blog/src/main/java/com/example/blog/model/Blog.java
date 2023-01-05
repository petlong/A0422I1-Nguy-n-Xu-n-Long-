package com.example.blog.model;

import javax.persistence.*;
import java.util.Date;

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

    private Date datePublish;

    public Date getDatePublish() {
        return datePublish;
    }

    public void setDatePublish(Date datePublish) {
        this.datePublish = datePublish;
    }

    @ManyToOne
    @JoinColumn (name = "category_id")
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Blog() {
    }

    public Blog(String id, String name, String text, Date datePublish, Category category) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.datePublish = datePublish;
        this.category = category;
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
