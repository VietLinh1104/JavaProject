package com.SinhVien;

public class SinhVienHTTT extends SinhVien {
    Double hocPhi;

    public SinhVienHTTT() {
    }

    public SinhVienHTTT(int maSV, String hoTen, int ngay, int thang, int nam, String gioiTinh, double GPA,
            Double hocPhi) {
        super(maSV, hoTen, ngay, thang, nam, gioiTinh, GPA);
        this.hocPhi = hocPhi;
    }

    public Double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(Double hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return "SinhVienHTTT [hocPhi=" + hocPhi + ", maSV=" + maSV + ", HoTen=" + HoTen + ", ngaySinh=" + ngaySinh
                + ", gioiTinh=" + gioiTinh + ", GPA=" + GPA + "]";
    }

}
