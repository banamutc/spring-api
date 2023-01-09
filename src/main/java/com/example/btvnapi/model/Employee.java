package com.example.btvnapi.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private String country;
    private int to;
    private List<LocalDateTime> chamCong;

    public Employee() {
    }

    public Employee(int id, String name, LocalDate dateOfBirth, String country, int to, List<LocalDateTime> chamCong) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.to = to;
        this.chamCong = chamCong;
    }

    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Employee setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Employee setCountry(String country) {
        this.country = country;
        return this;
    }

    public int getTo() {
        return to;
    }

    public Employee setTo(int to) {
        this.to = to;
        return this;
    }

    public List<LocalDateTime> getChamCong() {
        return chamCong;
    }

    public Employee setChamCong(List<LocalDateTime> chamCong) {
        this.chamCong = chamCong;
        return this;
    }
}
