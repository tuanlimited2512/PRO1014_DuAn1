/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.KhachHang;
import Repositories.IKhachHangRepository;
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
public class KhachHangRepository implements IKhachHangRepository{

    @Override
    public List<KhachHang> getSelectSql() {
        List<KhachHang> listKH = new ArrayList<>();
        String select = "select MaKH, TenKH, SDT, GioiTinh, Email, DiaChi from KhachHang";
        try {
            ResultSet rs = DbConnection.getDataFromQuery(select);
            while(rs.next()){
                listKH.add(new KhachHang(rs.getString(1), rs.getNString(2), rs.getString(3), rs.getInt(4), rs.getNString(5), rs.getNString(6)));
            }
            return listKH;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Boolean insert(KhachHang kh) {
        return null;
    }

    @Override
    public Boolean update(KhachHang kh) {
        return null;
    }

    @Override
    public Boolean delete(KhachHang kh) {
        return null;
    }
    
}
