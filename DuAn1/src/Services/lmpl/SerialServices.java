/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.lmpl;

import DomainModels.Serial;
import Repositories.ISerialRepository;
import Repositories.Impl.SerialRepository;
import Services.ISerialServices;

/**
 *
 * @author Dell Inpriron 5515
 */
public class SerialServices implements ISerialServices {

    private final ISerialRepository serial1;

    public SerialServices() {
        serial1 = new SerialRepository();
    }

    @Override
    public Integer them(Serial serial) {
        return serial1.them(serial);
    }

    @Override
    public Integer xoa(String maSP) {
        return serial1.xoa(maSP);
    }

    @Override
    public Integer xoaKhiUpdate( String maSP) {
        return serial1.xoaKhiUpdate( maSP);
    }

}
