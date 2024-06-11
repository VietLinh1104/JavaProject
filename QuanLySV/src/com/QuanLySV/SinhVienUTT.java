package com.QuanLySV;

public class SinhVienUTT extends SinhVien {
    protected String donVi;
    protected double luong;

    public SinhVienUTT(int maSV, String hoTen, String birth, String gender, double GPA, String donVi, double luong) {
        super(maSV, hoTen, birth, gender, GPA); // Gọi constructor của lớp cha
        this.donVi = donVi;
        this.luong = luong;
    }

    public void display() {
        System.out.println("Ma SV: " + maSV);
        System.out.println("Ho Ten: " + hoTen);
        System.out.println("Ngay Sinh: " + birth);
        System.out.println("Gioi Tinh: " + gender);
        System.out.println("GPA: " + GPA);
        System.out.println("Don Vi: " + donVi);
        System.out.println("Luong: " + luong);
    }

}
