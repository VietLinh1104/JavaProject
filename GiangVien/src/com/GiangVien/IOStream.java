package com.GiangVien;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class IOStream {
    private ArrayList<GiangVienCM> list;

    public ArrayList<GiangVienCM> checkFile() {
        try (FileInputStream fis = new FileInputStream("data.dat");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            ArrayList<GiangVienCM> objs = (ArrayList<GiangVienCM>) ois.readObject();
            return objs;

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy dữ liệu hiện có. Bắt đầu với danh sách trống.");
            return new ArrayList<>();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void saveFile() {
        try (FileOutputStream fos = new FileOutputStream("data.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(this.list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Sửa đổi để truyền Scanner vào phương thức input của GiangVienCM
    public void input(Scanner sc) {
        this.list = checkFile();

        System.out.print("Nhap so giang vien: ");
        int n = sc.nextInt();
        sc.nextLine(); // Tiêu thụ dòng mới

        for (int i = 0; i < n; i++) {
            GiangVienCM inObj = new GiangVienCM();
            inObj.input(sc); // Truyền Scanner vào phương thức input của GiangVienCM
            this.list.add(inObj);
        }
        saveFile();

        System.out.println();
        display();
    }

    public void display() {
        this.list = checkFile();
        System.out.println("Danh sach giang vien:");
        for (GiangVienCM obj : this.list) {
            System.out.println(obj.toString());
        }
    }

    public static void main(String[] args) {
        IOStream main = new IOStream();
        Scanner sc = new Scanner(System.in);
        main.display();
    }
}
