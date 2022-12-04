/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.lmpl;

import DomainModels.SanPham;
import Repositories.ISanPhamRepository;
import Repositories.Impl.SanPhamRepositoryImpl;
import java.util.ArrayList;

/**
 *
 * @author Tran Thi My Dung
 */
public class SanPhamServiceImpl implements ISanPhamService{
    private ISanPhamRepository repository = new SanPhamRepositoryImpl();

    @Override
    public ArrayList<SanPham> getAll() {
        return repository.getAll();
    }

    @Override
    public String add(SanPham sp) {
        boolean add = repository.add(sp);
        if (add) {
            return "Thêm thành công !";
        } else {
            return  "Thêm thất bại !";
        }
    }

    @Override
    public String update(SanPham sp, String ma) {
        boolean update = repository.update(sp, ma);
        if (update) {
            return "Cập nhập thành công!";
        } else {
            return "Cập nhập thất bại!";
        }
    }

    @Override
    public String delete(String ma) {
        boolean delete = repository.delete(ma);
        if (delete) {
            return "Xóa thành công!";
        } else {
            return "Xóa thất bại!";
        }
    }

    @Override
    public ArrayList<SanPham> timKiem(String ten) {
        return repository.timKiem(ten);
    }

    @Override
    public ArrayList<SanPham> locMauSac(String ms) {
        return repository.locMauSac(ms);
    }

    @Override
    public ArrayList<SanPham> locHDH(String hdh) {
        return repository.locHDH(hdh);
    }
    
}
