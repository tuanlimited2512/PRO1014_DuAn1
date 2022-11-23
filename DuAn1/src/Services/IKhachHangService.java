/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.KhachHang;
import java.util.List;

/**
 *
 * @author anhtu
 */
public interface IKhachHangService {
    List<KhachHang> getSelectSql();
    Boolean insert(KhachHang kh);
    Boolean update(KhachHang kh);
    Boolean delete(KhachHang kh);
}
