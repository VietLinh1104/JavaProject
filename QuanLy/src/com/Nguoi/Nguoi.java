package Nguoi;

import java.io.Serializable;

public class Nguoi implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String name;
    protected String birth;
    protected String address;
    protected String gender;

    public Nguoi() {
    }

    public Nguoi(String name, String birth, String address, String gender) {
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Nguoi [name=" + name + ", birth=" + birth + ", address=" + address + ", gender=" + gender + "]";
    }

}
