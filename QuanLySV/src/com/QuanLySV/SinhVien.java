package com.QuanLySV;

import java.io.Serializable;

/**
 * SinhVien
 */
public class SinhVien implements Serializable {

    private static final long serialVersionUID = 1L;

    protected int maSV;
    protected String hoTen;
    protected DateClass birth;
    protected String gender;
    protected double GPA;

    public SinhVien() {
        this.maSV = 0;
        this.hoTen = "";
        this.birth = new DateClass("0/1/1900");
        this.gender = "";
        this.GPA = 0;
    }

    public SinhVien(int maSV, String hoTen, String birth, String gender, double GPA) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.birth = new DateClass(birth);
        this.gender = gender;
        this.GPA = GPA;
    }

    public int getMaSV() {
        return this.maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public DateClass getBirth() {
        return this.birth;
    }

    public void setBirth(DateClass birth) {
        this.birth = birth;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

}