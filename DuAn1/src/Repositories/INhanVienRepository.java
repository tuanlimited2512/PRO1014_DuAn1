/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.NhanVien;
import DomainModels.VaiTro;
import java.util.List;

/**
 *
 * @author anhtu
 */
public interface INhanVienRepository {
    List<NhanVien> getSelectSql();
    Integer insert(NhanVien nv, VaiTro vt);
    Boolean update(NhanVien nv , VaiTro vt);
    Boolean delete(NhanVien nv );
    List<NhanVien> tim(String hoTen);
}
