/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import ViewModels.ChiTietSPViewModel;
import java.util.List;

/**
 *
 * @author anhtu
 */
public interface IChiTietSPRepository {
    
    List<ChiTietSPViewModel> getAll();
    
    List<ChiTietSPViewModel> timKiemSP(String ten);
    
    List<ChiTietSPViewModel> locMauSac(String mauSac);
    
    List<ChiTietSPViewModel> getAllID();
}
