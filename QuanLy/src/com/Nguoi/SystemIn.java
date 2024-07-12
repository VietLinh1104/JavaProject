package Nguoi;

import java.util.Scanner;

public class SystemIn {
    Scanner sc = new Scanner(System.in);

    public SystemIn() {
    }

    public String inputStr(String nameVar) {
        System.out.print("Nhap " + nameVar + ": ");
        String var = sc.nextLine();
        return var;
    }

    public int inputInt(String nameVar) {
        System.out.print("Nhap " + nameVar + ": ");
        int var = sc.nextInt();
        sc.nextLine();
        return var;
    }

    public double inputDouble(String nameVar) {
        System.out.print("Nhap " + nameVar + ": ");
        double var = sc.nextDouble();
        sc.nextLine();
        return var;
    }
}
