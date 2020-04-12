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
public class SinhVienBiz extends SinhVienPoly{
    double diemMarketing;
    double diemSales;

    public SinhVienBiz(double diemMarketing, double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

   

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Điểm: "+getDiem()+"\n"+"Học Lực: "+getHocLuc());//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getDiem() {
        return (2*diemMarketing+diemSales)/3; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHocLuc() {
        return super.getHocLuc(); //To change body of generated methods, choose Tools | Templates.
    }
}
