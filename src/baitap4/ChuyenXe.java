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
public  class ChuyenXe {
    String maSoChuyen;
    String hoTenTx;
    String soXe;
    double doanhthu;
    
    public double getdoanhthu()
    {
        return doanhthu;
    }

    public ChuyenXe(String maSoChuyen, String hoTenTx, String soXe, double doanhthu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTx = hoTenTx;
        this.soXe = soXe;
        this.doanhthu = doanhthu;
    }

   
    public void Xuat()
    {
        System.out.println("Mã số Chuyến xe: " + maSoChuyen +"\n"+
                "Họ Tên Tài Xế: " + hoTenTx +"\n"+
                "Số Xe: " + soXe + "\n"+ "Doanh Thu đạt được: "+doanhthu); 
    }
}
