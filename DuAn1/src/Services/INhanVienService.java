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
    List<NhanVien> getSelectSqlLV();
    Integer insert(NhanVien nv, String tenVaiTro);
    Boolean update(NhanVien nv , String tenVaiTro);
    Boolean delete(NhanVien nv );
    List<NhanVien> timSDT(String sdt);
    List<NhanVien> timVT(String vt);
    List<NhanVien> timGT(String giotinh);
}
