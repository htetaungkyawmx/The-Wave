package com.solt.thewave.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Date dateCreate;
    private Double price;
    private int quantity;

    public OrderDetail(String name, Date dateCreate, Double price, int quantity, Book book) {
        this.name = name;
        this.dateCreate = dateCreate;
        this.price = price;
        this.quantity = quantity;
        this.book = book;
    }

    @ManyToOne
    private Book book;

}