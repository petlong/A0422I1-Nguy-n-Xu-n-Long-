package com.example.demo1.model;

import javax.persistence.*;

@Entity (name = "product")
public class Product {
//    @Id
//    //tự động tăng
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column (name = "id_song", columnDefinition = "VARCHAR(50)")
    private String idSong;

    @Column (name = "name_song",columnDefinition = "VARCHAR(50)")
    private String nameSong;
    private float price;
    private String producer;
    private String description;

    public Product() {
    }

    public String getIdSong() {
        return idSong;
    }

    public void setIdSong(String idSong) {
        this.idSong = idSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
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
