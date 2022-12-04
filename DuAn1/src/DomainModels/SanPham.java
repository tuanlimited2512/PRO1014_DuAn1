/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author Tran Thi My Dung
 */
public class SanPham {
    private String maSP ;
    private String tenSP;
    private String mauSac;
    private String heDieuHanh;
    private int namBH;
    private float trongLuong;
    private String xuatXu;
    private boolean trangThai;
    private String moTa;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, String mauSac, String heDieuHanh, int namBH, float trongLuong, String xuatXu, boolean trangThai, String moTa) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.mauSac = mauSac;
        this.heDieuHanh = heDieuHanh;
        this.namBH = namBH;
        this.trongLuong = trongLuong;
        this.xuatXu = xuatXu;
        this.trangThai = trangThai;
        this.moTa = moTa;
    }

    public SanPham(String maSP, String tenSP, String mauSac, String heDieuHanh, float trongLuong, boolean trangThai) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.mauSac = mauSac;
        this.heDieuHanh = heDieuHanh;
        this.trongLuong = trongLuong;
        this.trangThai = trangThai;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getHeDieuHanh() {
        return heDieuHanh;
    }

    public void setHeDieuHanh(String heDieuHanh) {
        this.heDieuHanh = heDieuHanh;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public float getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(float trongLuong) {
        this.trongLuong = trongLuong;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    public Object [] toDataRow(){
        return new Object[] {maSP, tenSP, mauSac, heDieuHanh, namBH, trongLuong, xuatXu, trangThai == true ? "Còn hàng" : "Hết hàng", moTa};
    }
}
