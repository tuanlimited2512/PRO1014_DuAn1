/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.SanPham;
import Repositories.ISanPhamRepository;
import Utilities.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Tran Thi My Dung
 */
public class SanPhamRepositoryImpl implements ISanPhamRepository {

    @Override
    public ArrayList<SanPham> getAll() {
        String sql = "SELECT [MaSP],[TenSP] ,[MauSac],[HeDieuHanh],[NamBH]\n"
                + "	  ,[TrongLuong],[XuatXu],[TrangThai],[MoTa]\n"
                + "  FROM [dbo].[SanPham]";
        try ( Connection con = DbConnection.openDbConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ArrayList<SanPham> listSP = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listSP.add(new SanPham(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getInt(5), rs.getFloat(6), rs.getString(7),
                        rs.getBoolean(8), rs.getString(9)));
            }
            return listSP;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean add(SanPham sp) {
        String sql = "INSERT INTO [dbo].[SanPham]\n"
                + "           ([TenSP],[MauSac],[HeDieuHanh] ,[NamBH]\n"
                + "           ,[TrongLuong],[XuatXu],[TrangThai],[MoTa])\n"
                + "     VALUES (?,?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = DbConnection.openDbConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, sp.getTenSP());
            ps.setObject(2, sp.getMauSac());
            ps.setObject(3, sp.getHeDieuHanh());
            ps.setObject(4, sp.getNamBH());
            ps.setObject(5, sp.getTrongLuong());
            ps.setObject(6, sp.getXuatXu());
            ps.setObject(7, sp.isTrangThai());
            ps.setObject(8, sp.getMoTa());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean update(SanPham sp, String ma) {
        String sql = "UPDATE [dbo].[SanPham]\n"
                + "   SET [TenSP] = ?\n"
                + "      ,[MauSac] = ?\n"
                + "      ,[HeDieuHanh] = ?\n"
                + "      ,[NamBH] = ?\n"
                + "      ,[TrongLuong] = ?\n"
                + "      ,[XuatXu] = ?\n"
                + "      ,[TrangThai] = ?\n"
                + "      ,[MoTa] = ?\n"
                + " WHERE [MaSP] = ?";
        int check = 0;
        try ( Connection con = DbConnection.openDbConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, sp.getTenSP());
            ps.setObject(2, sp.getMauSac());
            ps.setObject(3, sp.getHeDieuHanh());
            ps.setObject(4, sp.getNamBH());
            ps.setObject(5, sp.getTrongLuong());
            ps.setObject(6, sp.getXuatXu());
            ps.setObject(7, sp.isTrangThai());
            ps.setObject(8, sp.getMoTa());
            ps.setObject(9, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean delete(String ma) {
        String sql = "DELETE FROM [dbo].[SanPham]\n"
                + "      WHERE MaSP = ?";
        int check = 0;
        try ( Connection con = DbConnection.openDbConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public ArrayList<SanPham> timKiem(String ten) {
        String sql = "SELECT [MaSP],[TenSP] ,[MauSac],[HeDieuHanh],[NamBH]\n"
                + "	  ,[TrongLuong],[XuatXu],[TrangThai],[MoTa]\n"
                + "  FROM [dbo].[SanPham] WHERE TenSP like ?";
        try ( Connection con = DbConnection.openDbConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ArrayList<SanPham> listSP = new ArrayList<>();
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listSP.add(new SanPham(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getInt(5), rs.getFloat(6), rs.getString(7),
                        rs.getBoolean(8), rs.getString(9)));
            }
            return listSP;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public ArrayList<SanPham> locHDH(String hdh) {
        String sql = "SELECT [MaSP],[TenSP] ,[MauSac],[HeDieuHanh],[NamBH]\n"
                + "                ,[TrongLuong],[XuatXu],[TrangThai],[MoTa]\n"
                + "		   FROM [dbo].[SanPham] WHERE HeDieuHanh = ?";
        try ( Connection con = DbConnection.openDbConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ArrayList<SanPham> listSP = new ArrayList<>();
            ps.setObject(1, hdh);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listSP.add(new SanPham(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getInt(5), rs.getFloat(6), rs.getString(7),
                        rs.getBoolean(8), rs.getString(9)));
            }
            return listSP;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public ArrayList<SanPham> locMauSac(String ms) {
        String sql = "SELECT [MaSP],[TenSP] ,[MauSac],[HeDieuHanh],[NamBH]\n"
                + "                ,[TrongLuong],[XuatXu],[TrangThai],[MoTa]\n"
                + "		   FROM [dbo].[SanPham] WHERE MauSac = ?";
        try ( Connection con = DbConnection.openDbConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ArrayList<SanPham> listSP = new ArrayList<>();
            ps.setObject(1, ms);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listSP.add(new SanPham(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getInt(5), rs.getFloat(6), rs.getString(7),
                        rs.getBoolean(8), rs.getString(9)));
            }
            return listSP;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
