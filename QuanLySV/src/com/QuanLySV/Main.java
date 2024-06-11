package com.QuanLySV;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Tạo một đối tượng SinhVienUTT
        Scanner sc = new Scanner(System.in);

        System.out.print("Ma SV: ");
        int maSV = sc.nextInt();
        sc.nextLine();

        System.out.print("Ho Ten: ");
        String hoTen = sc.nextLine();

        System.out.print("Ngay Sinh: ");
        String birth = sc.nextLine();

        System.out.print("Gioi Tinh: ");
        String gender = sc.nextLine();

        System.out.print("GPA: ");
        double GPA = sc.nextDouble();
        sc.nextLine();

        System.out.print("Don Vi: ");
        String donVi = sc.nextLine();

        System.out.print("Luong: ");
        double luong = sc.nextDouble();
        sc.nextLine();

        SinhVienUTT svUTT = new SinhVienUTT(maSV, hoTen, birth, gender, GPA, donVi, luong);

        System.out.println();

        try (FileOutputStream fos = new FileOutputStream("student.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(svUTT);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("student.dat");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            SinhVienUTT sv = (SinhVienUTT) ois.readObject();
            sv.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
