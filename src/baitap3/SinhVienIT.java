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
public class SinhVienIT extends SinhVienPoly{
    double diemJava;
    double diemhtml;
    double diemcss;

    public SinhVienIT(double diemJava, double diemhtml, double diemcss, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemhtml = diemhtml;
        this.diemcss = diemcss;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemhtml() {
        return diemhtml;
    }

    public void setDiemhtml(double diemhtml) {
        this.diemhtml = diemhtml;
    }

    public double getDiemcss() {
        return diemcss;
    }

    public void setDiemcss(double diemcss) {
        this.diemcss = diemcss;
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Điểm: "+getDiem()+"\n"+"Học Lực: "+getHocLuc());//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getDiem() {
        return (2*diemJava+diemcss+diemhtml)/4; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHocLuc() {
        return super.getHocLuc(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
