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
public class XeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgay;

    public XeNgoaiThanh(String noiDen, int soNgay, String maSoChuyen, String hoTenTx, String soXe, double doanhthu) {
        super(maSoChuyen, hoTenTx, soXe, doanhthu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    @Override
    public void Xuat() {
        super.Xuat(); 
        System.out.println("Nơi Đến: "+noiDen+"\n"+ "Số ngày đi được: "+soNgay );
    }
    }

