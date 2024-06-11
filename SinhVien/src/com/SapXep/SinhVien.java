package com.SapXep;

public class SinhVien implements Comparable<SinhVien> {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SinhVien(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public SinhVien() {
        this.name = "Empty Name";
        this.age = 0;
    }

    @Override
    public String toString() {
        return "SinhVien{name='" + name + "', age=" + age + "}";
    }

    @Override
    public int compareTo(SinhVien svNew) {
        if (this.getAge() > svNew.getAge())
            return 1;
        else if (this.getAge() == svNew.getAge())
            return 0;
        else
            return -1;
    }
}
