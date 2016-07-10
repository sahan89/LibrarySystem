package com.sahan.model;


import javax.persistence.*;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * Created by sahan on 7/8/2016.
 */
@Entity
@Table(name = "book_table")
public  class Book implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "isbnNo")
    private String isbnNo;

    @Column(name = "author")
    private String author;

    @Column(name = "price")
    private Integer price;

    @Column(name = "group_type")
    private String group;

    @Column(name = "placeOfPub")
    private String placeOfPub;

    @Column(name = "available")
    private String available;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(String isbnNo) {
        this.isbnNo = isbnNo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPlaceOfPub() {
        return placeOfPub;
    }

    public void setPlaceOfPub(String placeOfPub) {
        this.placeOfPub = placeOfPub;
    }

    public String getAvailable() {
        return available;
    }
    public void setAvailable(String available) {
        this.available = available;
    }
}
