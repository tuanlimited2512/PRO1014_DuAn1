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
    public List<NhanVien> getSelectSqlLV() {
        return repository.getSelectSqlLV();
    }
    
    @Override
    public Integer insert(NhanVien nv, String tenVaiTro) {
        return repository.insert(nv, tenVaiTro);
    }

    @Override
    public Boolean update(NhanVien nv , String tenVaiTro) {
        return repository.update(nv,tenVaiTro);
    }

    @Override
    public Boolean delete(NhanVien nv ) {
        return repository.delete(nv);
    }

    @Override
    public List<NhanVien> timSDT(String sdt) {
        return repository.timSDT(sdt);
    }

    @Override
    public List<NhanVien> timVT(String vt) {
        return repository.timVT(vt);
    }

    @Override
    public List<NhanVien> timGT(String giotinh) {
        return repository.timGT(giotinh);
    }

}
