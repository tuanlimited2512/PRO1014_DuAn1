/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author anhtu
 */
public class ThongKeSPViewModel {
    String ten;
    int soluong;
    double giacao, giathap, doanhthu;

    public ThongKeSPViewModel() {
    }

    public ThongKeSPViewModel(String ten, int soluong, double giacao, double giathap, double doanhthu) {
        this.ten = ten;
        this.soluong = soluong;
        this.giacao = giacao;
        this.giathap = giathap;
        this.doanhthu = doanhthu;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGiacao() {
        return giacao;
    }

    public void setGiacao(double giacao) {
        this.giacao = giacao;
    }

    public double getGiathap() {
        return giathap;
    }

    public void setGiathap(double giathap) {
        this.giathap = giathap;
    }

    public double getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(double doanhthu) {
        this.doanhthu = doanhthu;
    }
    
    public Object[] toDataRow(){
        return new Object[]{ten, soluong, giacao, giathap, doanhthu};
    }
}
