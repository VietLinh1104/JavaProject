package com.Management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Control ctrl = new Control();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add book");
            System.out.println("2. Delete book by ID");
            System.out.println("3. Show book list");

            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    ctrl.addBook();
                    break;
                case 2:
                    ctrl.deleteBook();
                    break;
                case 3:
                    ctrl.showListBook();
                    break;
                case 5:
                    ctrl.sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
            System.out.println();
        }
    }

}
