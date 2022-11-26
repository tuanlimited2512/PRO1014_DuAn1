/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.ThuocTinhCPU;
import java.util.ArrayList;

/**
 *
 * @author Tran Thi My Dung
 */
public interface IThuocTinhCPURepository {

    ArrayList<ThuocTinhCPU> getAll();

    boolean add (ThuocTinhCPU cpu);

    boolean update(ThuocTinhCPU cpu, String maCPU);

    boolean delete(String maCPU);
    
}
