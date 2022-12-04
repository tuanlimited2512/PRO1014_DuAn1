/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.SanPham;
import java.util.ArrayList;

/**
 *
 * @author Tran Thi My Dung
 */
public interface ISanPhamRepository {

    ArrayList<SanPham> getAll();

    boolean add(SanPham sp);

    boolean update(SanPham sp, String ma);

    boolean delete(String ma);

    ArrayList<SanPham> timKiem(String ten);
    
    ArrayList<SanPham> locHDH(String hdh);
    
    ArrayList<SanPham> locMauSac(String ms);
    
}
