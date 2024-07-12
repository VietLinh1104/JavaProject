package com.Value;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller ctrl = new Controller();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Nhap thong tin Number");
            // hiển thị danh sách Number đã tạo
            System.out.println("2. hiển thị danh sách");

            System.out.println("3. Thoat");
            System.out.print("Chon mot tuy chon: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    ctrl.createObj();
                    break;
                case 2:
                    ctrl.displayList();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
