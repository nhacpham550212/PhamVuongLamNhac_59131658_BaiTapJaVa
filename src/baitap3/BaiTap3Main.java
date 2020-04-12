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
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienPoly Nhac = new SinhVienIT(8, 7, 9, "Phạm Vương Lam Nhạc", "CNTT");
        SinhVienPoly Dat = new SinhVienBiz(7, 8, "Thái Thành Đạt", "MKT");
        SinhVienPoly Long = new SinhVienBiz(9, 8, "Nguyễn Hoàng Long", "QTKD");
        Nhac.Xuat();
        Dat.Xuat();
        Long.Xuat();
        }
    
    
}
