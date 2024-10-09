package com.eam.monolitichApp.model;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sku", length = 20, unique = true)
    private String sku;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "price", columnDefinition = "DECIMAL(10,2) DEFAULT 0.0")
    private double price;

    @Column(name = "brand", length = 50)
    private String brand;

    @Column(name = "shop", length = 50)
    private String shop;

    public Product() {
        super();
    }

    public Product(Long id, String sku, String name, double price, String brand, String shop) {
        this.id = id;
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.shop = shop;
    }

    public Product(String sku, String name, double price, String brand, String shop) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.shop = shop;
    }

    public Long getId() {
        return id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }
}
