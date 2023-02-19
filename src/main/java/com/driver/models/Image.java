package com.driver.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "image")
public class Image {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private String description;
    private String dimensions;

    @ManyToOne
    @JoinColumn
    private Blog blog;             // unidirectional mapping with blog

    public Image() {

    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}