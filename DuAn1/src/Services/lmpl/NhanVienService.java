/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.lmpl;

import DomainModels.NhanVien;
import DomainModels.VaiTro;
import Repositories.INhanVienRepository;
import Repositories.Impl.NhanVienRepository;
import Services.INhanVienService;
import java.util.List;

/**
 *
 * @author anhtu
 */
public class NhanVienService implements INhanVienService{
    private final INhanVienRepository repository;
    public NhanVienService() {
        this.repository = new NhanVienRepository();
    }

    
    @Override
    public List<NhanVien> getSelectSql() {
        return repository.getSelectSql();
    }

    @Override
    public Integer insert(NhanVien nv, VaiTro vt) {
        return repository.insert(nv, vt);
    }

    @Override
    public Integer update(NhanVien nv) {
        return repository.update(nv);
    }

    @Override
    public Integer delete(NhanVien nv) {
        return repository.delete(nv);
    }

    @Override
    public List<NhanVien> tim(String hoTen) {
        return repository.tim(hoTen);
    }
    
}
