/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.NhanVien;
import DomainModels.VaiTro;
import Repositories.INhanVienRepository;
import Utilities.DbConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anhtu
 */
public class NhanVienRepository implements INhanVienRepository{

    @Override
    public List<NhanVien> getSelectSql() {
        List<NhanVien> listNV = new ArrayList<>();
        String select = "select MaNV, HoTen, CONVERT (VARCHAR(10), NgaySinh, 103), GioiTinh, DiaChi, SDT, Email, MatKhau, VaiTro.TenVaiTro, TinhTrang from nhanvien "
                + "join VaiTro on VaiTro.MaVaiTro=NhanVien.MaVaiTro";
        try {
            ResultSet rs = DbConnection.getDataFromQuery(select);
            while(rs.next()){
                listNV.add(new NhanVien(rs.getString(1), rs.getNString(2), rs.getString(3), rs.getInt(4), rs.getNString(5),
                rs.getString(6), rs.getString(7), rs.getString(8), rs.getNString(9), rs.getInt(10)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNV;
    }

    @Override
    public Integer insert(NhanVien nv, VaiTro vt) {
        String select = "select MaVaiTro from VaiTro Where TenVaiTro = ? ";
        String chua = null;
        try {
            ResultSet rs1 = DbConnection.getDataFromQuery(select, vt.getTenVaiTro());
            while(rs1.next()){
                chua = rs1.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String insert = "INSERT INTO NhanVien(MaNV, HoTen, NgaySinh, GioiTinh, DiaChi, SDT, Email, MatKhau, MaVaiTro, TinhTrang) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Integer kq = DbConnection.excuteUpdate(insert, nv.getMa(), nv.getTen(), nv.getNgaySinh(), nv.getGioiTinh(), nv.getDiaChi(),
                nv.getSdt(), nv.getEmail(), nv.getMatKhau(), chua, nv.getTrangThai());
        return kq;
    }

    @Override
    public Integer update(NhanVien nv) {
        return null;
    }

    @Override
    public Integer delete(NhanVien nv) {
        return null;
    }

    @Override
    public List<NhanVien> tim(String hoTen) {
        return null;
    }
    
}
