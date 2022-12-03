/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import Repositories.IGioHangRepository;
import Utilities.DbConnection;
import ViewModels.GioHangViewModel;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell Inpriron 5515
 */
public class GioHangRepository implements IGioHangRepository {

    @Override
    public ArrayList<GioHangViewModel> get(String ma) {
        String sql = "Select TenSP,HoaDonChiTiet.SoLuong,HoaDonChiTiet.DonGia,TienGiamGia from HoaDonChiTiet,SanPham\n"
                + "where SanPham.MaSP = HoaDonChiTiet.MaSP\n"
                + " and MaHD=?";
        ArrayList<GioHangViewModel> li = new ArrayList<>();
        try {
            ResultSet rs = DbConnection.getDataFromQuery(sql, ma);
            while (rs.next()) {
                li.add(new GioHangViewModel(rs.getString(1), rs.getInt(2), rs.getDouble(3),rs.getString(4)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GioHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return li;
    }

    @Override
    public ArrayList<GioHangViewModel> get1(String ma) {
        String sql = "Select SanPham.MaSP,TenSP,HoaDonChiTiet.SoLuong,HoaDonChiTiet.DonGia,TienGiamGia from HoaDonChiTiet,SanPham\n"
                + "where SanPham.MaSP = HoaDonChiTiet.MaSP\n"
                + " and MaHD=?";
        ArrayList<GioHangViewModel> li = new ArrayList<>();
        try {
            ResultSet rs = DbConnection.getDataFromQuery(sql, ma);
            while (rs.next()) {
                li.add(new GioHangViewModel(rs.getString(1),rs.getString(2), rs.getInt(3), rs.getDouble(4),rs.getString(5)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GioHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return li;
    }

}
