/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author anhtu
 */
public class HoaDonCTViewModel {
    String mahd, masp, tensp;
    int soluong;
    double dongia;

    public HoaDonCTViewModel() {
    }

    public HoaDonCTViewModel(String mahd, String masp, String tensp, int soluong, double dongia) {
        this.mahd = mahd;
        this.masp = masp;
        this.tensp = tensp;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    @Override
    public String toString() {
        return "HoaDonCTViewModel{" + "mahd=" + mahd + ", masp=" + masp + ", tensp=" + tensp + ", soluong=" + soluong + ", dongia=" + dongia + '}';
    }
    
    public Object[] toDataRow(){
        return new Object[]{mahd, masp, tensp, soluong, dongia, dongia * soluong};
    }
    
}
