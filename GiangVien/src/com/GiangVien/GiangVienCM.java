package com.GiangVien;

import java.io.Serializable;
import java.util.Scanner;

public class GiangVienCM extends GiangVien implements Serializable {
    private double heSoLuong;
    private int thamNien;

    public GiangVienCM() {
        this.heSoLuong = 0.0;
        this.thamNien = 0;
    }

    public GiangVienCM(int giangvien_id, String name, String birth, String gender, double heSoLuong, int thamNien) {
        super(giangvien_id, name, birth, gender);
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    @Override
    public String toString() {
        return super.toString() + " GiangVienCM{" + "heSoLuong=" + heSoLuong + ", thamNien=" + thamNien + '}';
    }

    // Sửa đổi để sử dụng Scanner được truyền từ bên ngoài
    public void input(Scanner scanner) {
        System.out.print("Nhap ID giang vien: ");
        int giangvien_id = scanner.nextInt();
        scanner.nextLine(); // Tiêu thụ dòng mới

        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();

        System.out.print("Ngay sinh: ");
        String birth = scanner.nextLine();

        System.out.print("Nhap gioi tinh: ");
        String gender = scanner.nextLine();

        System.out.print("He so luong: ");
        double heSoLuong = scanner.nextDouble();

        System.out.print("Tham nien: ");
        int thamNien = scanner.nextInt();
        scanner.nextLine(); // Tiêu thụ dòng mới

        // Cập nhật thông tin
        setGiangvien_id(giangvien_id);
        setName(name);
        setBirth(birth);
        setGender(gender);
        setHeSoLuong(heSoLuong);
        setThamNien(thamNien);
    }

    public static void main(String[] args) {
        GiangVienCM obj = new GiangVienCM(1, "Linh", "06/02/2005", "Nam", 5.0, 5);

        Scanner sc = new Scanner(System.in);
        obj.input(sc);
        System.out.println(obj.toString());
    }
}
