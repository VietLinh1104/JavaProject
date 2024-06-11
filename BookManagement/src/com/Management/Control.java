package com.Management;

import java.util.ArrayList;
import java.util.Scanner;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Control {
    private static final String FILE_NAME = "books.dat";
    Scanner sc = new Scanner(System.in);
    ArrayList<Book> bookList = new ArrayList<>();

    private ArrayList<Book> checkFile() {
        ArrayList<Book> books = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(FILE_NAME);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            books = (ArrayList<Book>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No existing book data found. Starting with an empty list.");
        }

        return books;
    }

    private void saveFile() {
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(bookList);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // them vao list
    public void addBook() {
        bookList = checkFile();
        int n = 3;

        for (int i = 1; i < n; i++) {
            System.out.println("Nhap Thong Tin Cho Sach: " + i);

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Arthor: ");
            String arthor = sc.nextLine();

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Category: ");
            String category = sc.nextLine();

            System.out.println();

            bookList.add(new Book(id, arthor, title, category));

        }

        saveFile();

    }

    public void showListBook() {
        bookList = checkFile();
        for (Book book : bookList) {
            book.display();
        }
    }

    // xoa khoi list
    public void deleteBook() {
        bookList = checkFile();
        System.out.print("Nhap ID muon xoa: ");
        int id = Integer.parseInt(sc.nextLine());

        boolean removed = bookList.removeIf(book -> book.getId() == id);

        saveFile();
    }

}
