package com.solt.thewave.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 2, message = "Name must be at least 2 characters long")
    private String name;

    private String isbn;

    @Size(min = 5, message = "Description must be at least 5 characters long")
    private String description;

    private String category;

    private Double ourPrice;

    private Double listPrice;

    public Book(String name, String isbn, String description, String category, Double ourPrice, Double listPrice) {
        this.name = name;
        this.isbn = isbn;
        this.description = description;
        this.category = category;
        this.ourPrice = ourPrice;
        this.listPrice = listPrice;
    }

    @OneToMany
    private List<OrderDetail> orderDetails;
}
