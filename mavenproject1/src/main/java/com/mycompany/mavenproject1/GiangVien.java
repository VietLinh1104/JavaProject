/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;


/**
 *
 * @author linht
 */
public class GiangVien {
    protected int giangvien_id;
    protected String name;
    protected String birth;
    protected String gender;

    public GiangVien() {
        this.giangvien_id = 0;
        this.name = "";
        this.birth = "";
        this.gender = "";
    }
    
    

    public GiangVien(int giangvien_id, String name, String birth, String gender) {
        this.giangvien_id = giangvien_id;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
    }

    public int getGiangvien_id() {
        return giangvien_id;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGiangvien_id(int giangvien_id) {
        this.giangvien_id = giangvien_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "giangvien_id=" + giangvien_id + ", name=" + name + ", birth=" + birth + ", gender=" + gender + '}';
    }
    
    
}
