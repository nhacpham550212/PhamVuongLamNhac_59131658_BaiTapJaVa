/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author Administrator
 */
public abstract class SinhVienPoly {
    String hoTen;
    String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    public double getDiem(){
        return 0;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public String getHocLuc(){
        if(getDiem()<5) return "Yếu";
        if(getDiem()>=5&&getDiem()<6.5) return "Trung Bình";
        if(getDiem()>=6.5&&getDiem()<7.5) return "Khá";
        if(getDiem()>=7.5&&getDiem()<9) return "Giỏi";
        if(getDiem()>=9&&getDiem()<10) return "Xuất Sắc";   
        return " ";
    }
    public void Xuat(){
        System.out.println("Họ Tên:"+ hoTen+"\n"+"Ngành:"+ nganh);
    }
}
