package com.Staff;

public class Person {
    String name, address, gender;
    DateClass birth;

    public Person(String name, String birth, String address, String gender) {
        this.name = name;
        this.birth = new DateClass(birth);
        this.address = address;
        this.gender = gender; // Accept gender as string
    }

    void displayField() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Gender: " + gender);
        System.out.println("Birth: " + birth);
    }

    public static void main(String[] args) {
        Person man = new Person("James", "hanoi", "Nam", "8/3/2004");
        man.displayField();
    }
}
