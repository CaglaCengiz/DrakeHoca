package Proje_05_ClaruswayStore;

import java.util.Scanner;

public abstract class Product {

    private  int id;
    private String name;
    private double price;
    private double discountRate;
    private int amount;
    private Brand brand;
    private double screenSize;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int getAmount() {
        return amount;
    }

    public Brand getBrand() {
        return brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public abstract void menu();
    public abstract void addItem();
    public abstract void getProducts();
    public abstract void deleteItem();

    public Product(int id, String name, double price, double discountRate, int amount, Brand brand, double screenSize) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.amount = amount;
        this.brand = brand;
        this.screenSize = screenSize;
    }
}

