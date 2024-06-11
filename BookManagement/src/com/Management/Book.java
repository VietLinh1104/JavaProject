package com.Management;

import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String author;
    private String title;
    private String category;

    public Book() {
        this.id = 0;
        this.author = "Unknow Arthor";
        this.title = "Unknow Title";
        setCategory("Unknow Category");
    }

    public Book(int id, String author, String title, String category) {
        this.id = id;
        this.author = author;
        this.title = title;
        setCategory(category);
    }

    public static final String tapChi = "tap chi";
    public static final String KHXH = "KHXH";
    public static final String KHTN = "KHTN";
    public static final String luanVan = "luan van";

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        if (category.equals(tapChi) || category.equals(KHXH) || category.equals(KHTN) || category.equals(luanVan)
                || category.equals("")) {
            this.category = category;
        } else {
            throw new IllegalArgumentException(
                    "Category khong hop le. Các gia tri hop le la: tap chi, KHXH, KHTN, luan van.");
        }
    }

    public String getCategory() {
        return this.category;
    }

    public void display() {
        System.out
                .println("Book [id=" + id + ", author=" + author + ", title=" + title + ", category=" + category + "]");
    }

    public static void main(String[] args) {

        try {
            Book sach = new Book(0, "Arthor", "Title", "luan van");
            sach.display();

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

    }

}
