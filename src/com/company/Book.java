package com.company;

public class Book {
    private int price;
    private String name;
    private String author;

    public Book(int price, String name, String author){
        this.price = price;
        this.name = name;
        this.author = author;
    }

    public Book(int price, String name){
        this.price = price;
        this.name = name;
        this.author = "";
    }

    public Book(int price){
        this.price = price;
    }

    public Book(String name, String author){
        this.name = name;
        this.author = author;
        this.price = 0;
    }

    public Book(String name){
        this.name = name;
        this.author = "";
        this.price = 0;
    }

    public Book(){
        this.name = "";
        this.author = "";
        this.price = 0;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return this.price;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public String toString(){
        return "Name's book is "+ this.name + ", author is "+ this.author+" and price is "+ this.price;
    }
}
