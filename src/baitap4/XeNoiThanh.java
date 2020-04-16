
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author Administrator
 */
public class XeNoiThanh extends ChuyenXe{
    String soTuyen;
    int soKm;

    public XeNoiThanh(String soTuyen, int soKm, String maSoChuyen, String hoTenTx, String soXe, double doanhthu) {
        super(maSoChuyen, hoTenTx, soXe, doanhthu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }


   @Override
    public void Xuat() {
        super.Xuat(); 
        System.out.println("Số Tuyến xe: "+soTuyen+"\n"+ "Số Km: "+soKm);
    }
    
}
