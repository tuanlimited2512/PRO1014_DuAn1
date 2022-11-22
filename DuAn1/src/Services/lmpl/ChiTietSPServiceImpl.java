/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.lmpl;

import Repositories.IChiTietSPRepository;
import Repositories.Impl.ChiTietSPRepository;
import Services.IChiTietSPService;
import ViewModels.ChiTietSPViewModel;
import java.util.List;

/**
 *
 * @author anhtu
 */
public class ChiTietSPServiceImpl implements IChiTietSPService {

    private final IChiTietSPRepository chiTietRePo;

    public ChiTietSPServiceImpl() {
        this.chiTietRePo = new ChiTietSPRepository();
    }

    @Override
    public List<ChiTietSPViewModel> getAll() {
        return chiTietRePo.getAll();
    }

    @Override
    public List<ChiTietSPViewModel> timKiemSP(String ten) {
        return chiTietRePo.timKiemSP(ten);
    }

    @Override
    public List<ChiTietSPViewModel> locMauSac(String mauSac) {
        return chiTietRePo.locMauSac(mauSac);
    }

    @Override
    public List<ChiTietSPViewModel> getAllID() {
        return chiTietRePo.getAllID();
    }

}
