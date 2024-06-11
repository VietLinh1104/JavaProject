package com.QuanLySV;

public class SinhVienHTTT extends SinhVien {
    protected int hocPhi;

    public SinhVienHTTT(int maSV, String hoTen, String birth, String gender, double GPA, int hocPhi) {
        super(maSV, hoTen, birth, gender, GPA); // Gọi constructor của lớp cha
        this.hocPhi = hocPhi;
    }

    public void display() {
        System.out.println("Ma SV: " + maSV);
        System.out.println("Ho Ten: " + hoTen);
        System.out.println("Ngay Sinh: " + birth);
        System.out.println("Gioi Tinh: " + gender);
        System.out.println("GPA: " + GPA);
        System.out.println("Hoc Phi: " + hocPhi);
    }
}
