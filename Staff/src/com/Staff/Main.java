package com.Staff;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

public class Main {
    // public static ArrayList<Staff> staffList = new ArrayList<>();

    public static void ghifile() {
        try {
            // Tạo file trên ổ cứng
            String file = "staff.dat";

            // Tạo luồng liên kết file để ghi
            FileWriter fw = new FileWriter(file);

            // Ghi dữ liệu vào file
            fw.write("John Doe,01/01/1990,Hanoi,Nam,Training,Organization,Office,1,1000,50,20\n");
            fw.write("Jane Smith,02/02/1995,Hanoi,Nam,HR,Company,Office,2,1200,60,25\n");
            fw.write("Michael Johnson,03/03/1985,Hanoi,Nam,IT,Corporation,Remote,3,1500,70,30\n");
            fw.write("Alice Johnson,04/04/1992,Hanoi,Nam,Marketing,Company,Remote,4,1100,55,22\n");

            // Đóng file
            fw.close();
        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    public static ArrayList<Staff> docfile() {
        ArrayList<Staff> staffList = new ArrayList<>();

        try {
            // Mở file
            File openfile = new File("staff.dat");

            // Tạo luồng liên kết đến file để đọc
            FileReader readfile = new FileReader(openfile);

            // Sử dụng bufferedReader để đọc nhanh hơn
            BufferedReader readboot = new BufferedReader(readfile);
            String line;

            // Đọc từng dòng trong file và in ra màn hình
            while ((line = readboot.readLine()) != null) {
                String dataField[] = line.split(",");

                String name = dataField[0];
                String birth = dataField[1];
                String address = dataField[2];
                String gender = dataField[3];
                String daoTao = dataField[4];
                String toChuc = dataField[5];
                String vanPhong = dataField[6];
                int heSoLuong = Integer.parseInt(dataField[7]);
                int luongCoBan = Integer.parseInt(dataField[8]);
                int thuong = Integer.parseInt(dataField[9]);
                int phat = Integer.parseInt(dataField[10]);

                Staff man = new Staff(name, birth, address, gender, daoTao, toChuc,
                        vanPhong, heSoLuong,
                        luongCoBan, thuong, phat);

                staffList.add(man);
            }

            // Đóng các luồng
            readboot.close();
            readfile.close();
        } catch (IOException err) {
            err.printStackTrace();
        }

        return staffList;

    }

    public static void main(String[] args) {
        // ghifile();
        ArrayList<Staff> staffList = docfile();
        for (Staff staff : staffList) {
            staff.display();
            System.out.println(); // In ra dòng trống giữa các đối tượng
        }
    }
}
