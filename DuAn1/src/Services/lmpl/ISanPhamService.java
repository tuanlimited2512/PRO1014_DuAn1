/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.lmpl;

import DomainModels.SanPham;
import java.util.ArrayList;

/**
 *
 * @author Tran Thi My Dung
 */
public interface ISanPhamService {
    
    ArrayList<SanPham> getAll();

    String add(SanPham sp);

    String update(SanPham sp, String ma);

    String delete(String ma);
    
    ArrayList<SanPham> timKiem(String ten);
    
    ArrayList<SanPham> locMauSac(String ms);
    
    ArrayList<SanPham> locHDH(String hdh);
    
}
