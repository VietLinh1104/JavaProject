package com.Value;

import java.util.Scanner;

public class SystemIn {
    Scanner sc = new Scanner(System.in);

    public String inputStr(String value) {
        System.out.print("Enter " + value + ": ");
        return sc.nextLine();
    }

    public int inputInt(String value) {
        System.out.print("Enter " + value + ": ");
        int valuen = sc.nextInt();
        sc.nextLine();
        return valuen;
    }

    public double inputDouble(String value) {
        System.out.print("Enter " + value + ": ");
        double valuen = sc.nextDouble();
        sc.nextLine();
        return valuen;
    }

}
