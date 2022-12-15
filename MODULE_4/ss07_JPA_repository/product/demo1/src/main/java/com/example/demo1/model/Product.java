package com.example.demo1.model;

import javax.persistence.*;

@Entity (name = "product")
public class Product {
//    @Id
//    //tự động tăng
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column (name = "id_song", columnDefinition = "VARCHAR(50)")
    private String id;

    @Column (name = "name_song",columnDefinition = "VARCHAR(50)")
    private String name;
    private float price;
    private String producer;
    private String description;

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String idSong) {
        this.id = idSong;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameSong) {
        this.name = nameSong;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
