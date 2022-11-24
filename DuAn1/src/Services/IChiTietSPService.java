/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.ChiTietSPViewModel;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author anhtu
 */
public interface IChiTietSPService {

    List<ChiTietSPViewModel> getAll();
    
    List<ChiTietSPViewModel> timKiemSP(String ten);
    
    List<ChiTietSPViewModel> locMauSac(String mauSac);
    
    List<ChiTietSPViewModel> getAllID();
    
    HashSet<String> getmau();

}
