package com.example.exam1.entity;

import javax.persistence.*;

@Entity
public class    Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "product_id")
    private Long Id;

    @Column(name = "product_string_id", length = 45, nullable = false)
    private String stringId;

    @Column(name = "product_name", length = 45, nullable = false)
    private String name;

    @Column(name = "price", nullable = false )
    private Double price;

    @Column(name = "quality", nullable = false )
    private Integer quality;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id", nullable = false)
    private Category category;

    public Product() {
    }

    public String getStringId() {
        return stringId;
    }

    public void setStringId(String stringId) {
        this.stringId = stringId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCatogery() {
        return category;
    }

    public void setCatogery(Category category) {
        this.category = category;
    }
}
