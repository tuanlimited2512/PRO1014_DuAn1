/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.ThuocTinhCPU;
import java.util.ArrayList;

/**
 *
 * @author Tran Thi My Dung
 */
public interface IThuocTinhCPUService {

    ArrayList<ThuocTinhCPU> getAll();

    String add(ThuocTinhCPU cpu);

    String update(ThuocTinhCPU cpu, String maCPU);

    String delete(String maCPU);
    
}
