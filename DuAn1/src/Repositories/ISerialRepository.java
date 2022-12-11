/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.Serial;

/**
 *
 * @author Dell Inpriron 5515
 */
public interface ISerialRepository {
    
    Integer them(Serial serial);
    
    Integer xoa(String maSP);
    
    Integer xoaKhiUpdate(String maSP);
    
}
