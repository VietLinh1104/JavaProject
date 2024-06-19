package com.SinhVien;

import java.util.Date;
import java.text.SimpleDateFormat;

class SinhVien {
    int maSV;
    String HoTen;
    Date ngaySinh;
    String gioiTinh;
    double GPA;

    public SinhVien() {
    }

    public SinhVien(int maSV, String hoTen, int ngay, int thang, int nam, String gioiTinh, double GPA) {
        this.maSV = maSV;
        this.HoTen = hoTen;
        this.ngaySinh = new Date(nam - 1900, thang + 1, ngay);
        this.gioiTinh = gioiTinh;
        this.GPA = GPA;
    }

    public int getMaSV() {
        return this.maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return this.HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(this.ngaySinh);
        return formattedDate;
    }

    public void setNgaySinh(int day, int month, int year) {
        this.ngaySinh = new Date(year - 1900, month + 1, day);
    }

    public String getGioiTinh() {
        return this.gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "SinhVien [maSV=" + maSV + ", HoTen=" + HoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh
                + ", GPA=" + GPA + "]";
    }

}