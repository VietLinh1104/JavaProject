package Nguoi;

public class NhanVien extends Nguoi {
    private String phongBan;
    private double heSoLuong;
    private int thamNien;
    private double luongCoBan;

    private static final String thietBi = "Thiết bị";
    private static final String nhanSu = "Nhân sự";
    private static final String RnD = "R&D";
    private static final String kinhDoanh = "Kinh doanh";

    public NhanVien() {
    }

    public NhanVien(String name, String birth, String address, String gender, String phongBan, double heSoLuong,
            int thamNien, double luongCoBan) {
        super(name, birth, address, gender);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        if (phongBan.equals(thietBi) || phongBan.equals(nhanSu) || phongBan.equals(RnD) || phongBan.equals(kinhDoanh)) {
            this.phongBan = phongBan;
        } else {
            System.out.println("Phong ban khong hop le!");
        }
    }

    public void creatObj() {
        SystemIn obj = new SystemIn();
        this.name = obj.inputStr("ho ten");
        this.birth = obj.inputStr("ngay sinh");
        this.address = obj.inputStr("dia chi");
        this.gender = obj.inputStr("gender");
        this.phongBan = obj.inputStr("phong ban");
        this.heSoLuong = obj.inputDouble("he so luong");
        this.thamNien = obj.inputInt("tham nien");
        this.luongCoBan = obj.inputDouble("luong co ban");
        System.out.println();
    }

    @Override
    public String toString() {
        return "NhanVien [name=" + name + ", phongBan=" + phongBan + ", birth=" + birth + ", heSoLuong=" + heSoLuong
                + ", address=" + address + ", thamNien=" + thamNien + ", gender=" + gender + ", luongCoBan="
                + luongCoBan + "]";
    }

}
