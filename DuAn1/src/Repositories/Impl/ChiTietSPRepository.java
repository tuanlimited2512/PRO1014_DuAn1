/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import Repositories.IChiTietSPRepository;
import Utilities.DbConnection;
import ViewModels.ChiTietSPViewModel;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anhtu
 */
public class ChiTietSPRepository implements IChiTietSPRepository {

    @Override
    public List<ChiTietSPViewModel> getAll() {
        List<ChiTietSPViewModel> list = new ArrayList<>();
        String sql = "select TenSP,GiaBan,GiamGia,MauSac,TenNSX,KichThuoc,TrongLuong,SoLuong from "
                + "ChiTietSP,SanPham,KhuyenMai,NSX,ManHinh\n"
                + "where ChiTietSP.MaSP=SanPham.MaSP\n"
                + "and ChiTietSP.MaKM=KhuyenMai.MaKM\n"
                + "and ChiTietSP.MaNSX=NSX.MaNSX\n"
                + "and ChiTietSP.MaManHinh=ManHinh.MaManHinh";
        try {
            ResultSet rs = DbConnection.getDataFromQuery(sql);
            while (rs.next()) {
                list.add(new ChiTietSPViewModel(rs.getString(1), rs.getDouble(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getInt(8)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    @Override
    public List<ChiTietSPViewModel> timKiemSP(String ten) {
        List<ChiTietSPViewModel> list = new ArrayList<>();
        String sql = "select TenSP,GiaBan,GiamGia,MauSac,TenNSX,KichThuoc,TrongLuong,SoLuong from ChiTietSP,SanPham,KhuyenMai,NSX,ManHinh\n"
                + "where ChiTietSP.MaSP=SanPham.MaSP\n"
                + "and ChiTietSP.MaKM=KhuyenMai.MaKM\n"
                + "and ChiTietSP.MaNSX=NSX.MaNSX\n"
                + "and ChiTietSP.MaManHinh=ManHinh.MaManHinh\n"
                + "and TenSP like ?";
        try {
            ResultSet rs = DbConnection.getDataFromQuery(sql, ten);
            while (rs.next()) {
                list.add(new ChiTietSPViewModel(rs.getString(1), rs.getDouble(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getInt(8)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    @Override
    public List<ChiTietSPViewModel> locMauSac(String mauSac) {
        List<ChiTietSPViewModel> list = new ArrayList<>();
        String sql = "select TenSP,GiaBan,GiamGia,MauSac,TenNSX,KichThuoc,TrongLuong,SoLuong from ChiTietSP,SanPham,KhuyenMai,NSX,ManHinh\n"
                + "where ChiTietSP.MaSP=SanPham.MaSP\n"
                + "and ChiTietSP.MaKM=KhuyenMai.MaKM\n"
                + "and ChiTietSP.MaNSX=NSX.MaNSX\n"
                + "and ChiTietSP.MaManHinh=ManHinh.MaManHinh\n"
                + "and MauSac=?";
        try {
            ResultSet rs = DbConnection.getDataFromQuery(sql, mauSac);
            while (rs.next()) {
                list.add(new ChiTietSPViewModel(rs.getString(1), rs.getDouble(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getInt(8)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    @Override
    public List<ChiTietSPViewModel> getAllID() {
        List<ChiTietSPViewModel> list = new ArrayList<>();
        String sql = "select ChiTietSP.MaSP,TenSP,GiaBan,GiamGia,MauSac,TenNSX,KichThuoc,TrongLuong,SoLuong from ChiTietSP,SanPham,KhuyenMai,NSX,ManHinh\n"
                + "where ChiTietSP.MaSP=SanPham.MaSP\n"
                + "and ChiTietSP.MaKM=KhuyenMai.MaKM\n"
                + "and ChiTietSP.MaNSX=NSX.MaNSX\n"
                + "and ChiTietSP.MaManHinh=ManHinh.MaManHinh";
        try {
            ResultSet rs = DbConnection.getDataFromQuery(sql);
            while (rs.next()) {
                list.add(new ChiTietSPViewModel(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getDouble(8), rs.getInt(9)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    @Override
    public HashSet<String> getmau() {
        HashSet<String> li = new HashSet<>();
        String sql = "select MauSac from "
                + "SanPham\n";
        try {
            ResultSet rs = DbConnection.getDataFromQuery(sql);
            while (rs.next()) {
                li.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return li;
    }

}
