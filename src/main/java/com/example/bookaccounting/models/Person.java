package com.example.bookaccounting.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
//@Table
@Getter
@Setter
public class Person {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name = "birth_year")
    private int birthYear;

    @OneToMany(mappedBy = "owner")
    List<Book> books;
}
