/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.Impl;

import DomainModels.Serial;
import Repositories.ISerialRepository;
import Utilities.DbConnection;

/**
 *
 * @author Dell Inpriron 5515
 */
public class SerialRepository implements ISerialRepository {

    @Override
    public Integer them(Serial serial) {
        String sql = "Insert into Serial values(NEWID(),N'Còn Hàng',?)";
        Integer row = DbConnection.excuteUpdate(sql, serial.getMaSP());
        return row;

    }

    @Override
    public Integer xoa(String maSP) {
        String sql = "DELETE Serial WHERE MaSP=?";
        Integer row = DbConnection.excuteUpdate(sql, maSP);
        return row;
    }

    @Override
    public Integer xoaKhiUpdate( String maSP) {
        String sql = "DELETE Serial WHERE MaSerial in (select top 1 MaSerial from Serial where MaSP = ? and TinhTrang = N'Còn Hàng')";
        Integer row = DbConnection.excuteUpdate(sql, maSP);
        return row;
    }

}
