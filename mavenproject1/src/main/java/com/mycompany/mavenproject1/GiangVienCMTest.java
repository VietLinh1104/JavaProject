package com.mycompany.mavenproject1;


import java.io.ByteArrayInputStream;
import java.io.InputStream;


public class GiangVienCMTest {
    private GiangVienCM giangVien;

    public void setUp() {
        giangVien = new GiangVienCM();
    }

    public void testNhapThongTin() {
        String input = "2\nnguyen van a\n01/01/1980\nnu\n6.0\n10\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        giangVien.nhapThongTin();
    }
    
    public static void main(String[]args){
        GiangVienCMTest obj = new GiangVienCMTest();
        obj.testNhapThongTin();
    }
}
