package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "Item")
public class Item {
    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;

    public Item(){}

    public Item(BigDecimal price, int quantity, BigDecimal value){
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Id
    @GeneratedValue
    @NotNull
    @JoinColumn(name = "item_id")
    public int getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "product_id")
    public Product getProduct() {
        return product;
    }

    @JoinColumn(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    @JoinColumn(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    @JoinColumn(name = "value")
    public BigDecimal getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
