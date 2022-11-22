/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.NhanVien;
import DomainModels.VaiTro;
import java.util.List;

/**
 *
 * @author anhtu
 */
public interface INhanVienService {
    List<NhanVien> getSelectSql();
    Integer insert(NhanVien nv, VaiTro vt);
    Integer update(NhanVien nv);
    Integer delete(NhanVien nv);
    List<NhanVien> tim(String hoTen);
}
