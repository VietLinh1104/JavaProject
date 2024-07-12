package com.GiangVien;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dữ liệu đầu vào mẫu
        String input = "4\n1\nJane Smith\n02-02-1990\nFemale\n2.0\n5\n"
                + "2\nAlex Brown\n03-03-1985\nMale\n1.8\n8\n"
                + "3\nEmily Davis\n04-04-1992\nFemale\n1.6\n3\n"
                + "4\nMichael Johnson\n05-05-1980\nMale\n2.5\n15\n";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            Scanner sc = new Scanner(System.in);

            IOStream instance = new IOStream();
            instance.input(sc); // Truyền Scanner từ bên ngoài
            System.out.println();

            // In hoặc kiểm tra giá trị để xác minh xử lý đầu vào đúng
            System.out.println(instance);
        } finally {
            System.setIn(stdin);
        }
    }
}
