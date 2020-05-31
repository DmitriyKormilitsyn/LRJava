package com.company;

import java.util.Arrays;

public class Book {
    private int id;
    private String name;
    private String [] author;
    private String publisher;
    private int year;
    private int pages;
    private int price;
    private String cover;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + Arrays.toString(author) +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", cover='" + cover + '\'' +
                '}';
    }

    public void setId(int nid) {
        this.id=nid;
    }

    public void setName(String nname) {
        this.name=nname;
    }

    public void setAuthor(String [] nauthor) {
        this.author=nauthor;
    }

    public void setPublisher(String npublisher) {
        this.publisher=npublisher;
    }

    public void setYear(int nyear) {
        this.year=nyear;
    }

    public void setPages(int npages) {
        this.pages=npages;
    }

    public void setPrice(int nprice) {
        this.price=nprice;
    }

    public void setCover(String ncover) {
        this.cover=ncover;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public int getPrice() {
        return price;
    }

    public String getCover() {
        return cover;
    }


    public Book(int id, String n, String [] a, String publisher, int year, int pgs, int price, String cover){
        this.id = id;
        this.name = n;
        this.author = a;
        this.publisher = publisher;
        this.year = year;
        this.pages = pgs;
        this.price = price;
        this.cover = cover;
    }
}