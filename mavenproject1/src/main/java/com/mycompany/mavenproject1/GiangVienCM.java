/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author linht
 */
public class GiangVienCM extends GiangVien {
    private double heSoLuong;
    private int thamNien;

    public GiangVienCM() {
        this.heSoLuong = 0.0;
        this.thamNien = 0;
    }
    
    

    public GiangVienCM(int giangvien_id, String name, String birth, String gender, double heSoLuong, int thamNien ) {
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
        return super.toString() + "GiangVienCM{" + "heSoLuong=" + heSoLuong + ", thamNien=" + thamNien + '}';
    }
    
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ID giảng viên: ");
        int giangvien_id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Nhập tên giảng viên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập ngày sinh: ");
        String birth = scanner.nextLine();

        System.out.print("Nhập giới tính: ");
        String gender = scanner.nextLine();

        System.out.print("Nhập hệ số lương: ");
        double heSoLuong = scanner.nextDouble();

        System.out.print("Nhập thâm niên: ");
        int thamNien = scanner.nextInt();

        // Cập nhật thông tin
        setGiangvien_id(giangvien_id);
        setName(name);
        setBirth(birth);
        setGender(gender);
        setHeSoLuong(heSoLuong);
        setThamNien(thamNien);
    }
    
    
    public static void main(String[] args){
        GiangVienCM obj = new GiangVienCM(1, "linh", "06/02/2005", "nam", 5.0, 5);    
       
        System.out.println(obj.toString());

    }
    
    
}
