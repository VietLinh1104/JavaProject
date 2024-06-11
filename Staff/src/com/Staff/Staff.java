package com.Staff;

public class Staff extends Person {
    String daoTao, toChuc, vanPhong;
    int heSoLuong, luongCoBan, thuong, phat, luongLinh;

    public Staff(String name, String birth, String address, String gender, String daoTao, String toChuc,
            String vanPhong, int heSoLuong,
            int luongCoBan, int thuong, int phat) {
        super(name, birth, address, gender);
        this.daoTao = daoTao;
        this.toChuc = toChuc;
        this.vanPhong = vanPhong;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
        this.thuong = thuong;
        this.phat = phat;
    }

    public int getLuongLinh() {
        this.luongLinh = luongCoBan * heSoLuong + (thuong - phat);
        return luongLinh;
    }

    public void display() {
        getLuongLinh();

        System.out.println("Ten: " + name);
        System.out.println("Ngay Sinh: " + birth);
        System.out.println("Dia Chi: " + address);
        System.out.println("Gioi Tinh: " + gender);
        System.out.println("Dao Tao: " + daoTao);
        System.out.println("To Chuc: " + toChuc);
        System.out.println("Van Phong: " + vanPhong);
        System.out.println("Ho So Luong: " + heSoLuong);
        System.out.println("Luong Co Ban: " + luongCoBan);
        System.out.println("Thuong: " + thuong);
        System.out.println("Phat: " + phat);
        System.out.println("Luong Linh: " + luongLinh);
    }

    public static void main(String[] args) {
        Staff man = new Staff("Harry Bron", "7/8/2004", "Hanoi", "Nam", "Dao Tao", "To Chuc", "Hoc Van", 3, 6, 2, 1);
        man.display();
    }

}
