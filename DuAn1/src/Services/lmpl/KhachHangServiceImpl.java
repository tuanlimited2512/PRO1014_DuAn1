/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.lmpl;

import DomainModels.KhachHang;
import Repositories.IKhachHangRepository;
import Repositories.Impl.KhachHangRepository;
import Services.IKhachHangService;
import java.util.List;

/**
 *
 * @author anhtu
 */
public class KhachHangServiceImpl implements IKhachHangService{
    
    private final IKhachHangRepository repository;

    public KhachHangServiceImpl() {
        this.repository = new KhachHangRepository();
    }
    
    @Override
    public List<KhachHang> getSelectSql() {
        return repository.getSelectSql();
    }

    @Override
    public Boolean insert(KhachHang kh) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean update(KhachHang kh) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean delete(KhachHang kh) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
