/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.DoanhThu;
import ViewModels.SPBanChay;
import ViewModels.TongHoaDon;
import ViewModels.TongKhachHang;
import java.util.List;

/**
 *
 * @author anhtu
 */
public interface IThongKeTQService {
    //Sản phẩm bán chạy
    List<SPBanChay> getSelectSql();
    List<SPBanChay> getSelectSqlT(String thang);
    List<SPBanChay> getSPBanChayN(String nam);
    
    //Tổng khách hàng
    List<TongKhachHang> getTKH();
    List<TongKhachHang> getTKH_T(String thang);
    List<TongKhachHang> getTKH_N(String nam);
    
    //Tổng hóa đơn
    List<TongHoaDon> getTHD();
    List<TongHoaDon> getTHD_T(String thang);
    List<TongHoaDon> getTHD_N(String nam);
    
    //Doanh thu
    List<DoanhThu> getDT();
    List<DoanhThu> getDT_T(String thang);
    List<DoanhThu> getDT_N(String nam);
}
