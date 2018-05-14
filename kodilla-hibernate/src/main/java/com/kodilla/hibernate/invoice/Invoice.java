package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "invoice")
public class Invoice {
    private int id;
    private String number;
    private List<Item> items = new ArrayList<>();

    public Invoice(){}

    public Invoice(String number){
        this.number = number;
    }

    @OneToMany(targetEntity = Item.class, mappedBy = "invoice", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Id
    @GeneratedValue
    @NotNull
    @JoinColumn(name = "id", unique = true)
    public int getId() {
        return id;
    }
    @JoinColumn(name = "number")
    public String getNumber() {
        return number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}