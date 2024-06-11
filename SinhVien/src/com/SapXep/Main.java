/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SapXep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Tuyet
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> svList = new ArrayList();

        System.out.println(" Nhap so luong n=");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println(" nhap sinh vien thu " + (i + 1) + ":");
            scanner.nextLine();

            System.out.print(" nhap ho ten :");
            String tenString = scanner.nextLine();

            System.out.print("nhap tuoi ");
            int tuoi = scanner.nextInt();
            SinhVien sv = new SinhVien(tenString, tuoi);
            svList.add(sv);

        }
        System.out.println("Xuat thong tin sinh vien :");
        for (SinhVien d : svList) {
            System.out.println(d);
        }

        Collections.sort(svList);

        System.out.println(" xuat danh sach sinh vien : ");
        for (SinhVien d : svList) {
            System.out.println(d);
        }
    }
}