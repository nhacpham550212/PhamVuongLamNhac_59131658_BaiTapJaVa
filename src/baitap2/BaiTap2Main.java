/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;

/**
 *
 * @author Administrator
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bai Tap 2");
        NhanVien Nhac = new NhanVien("Phạm Vương Lam Nhạc", 21, "Phạm Văn Đồng", 20000, 250);
        NhanVien Long = new NhanVien("Nguyễn Hoàng Long", 21, "Nguyễn Trãi", 15000, 120);
        NhanVien Dat = new NhanVien("Thái Thành Đạt", 21, "Đường 2/4", 19000, 220);
        NhanVien Huy = new NhanVien("Nguyễn Xuân Huy", 21, "Lý thái Tổ", 13000, 80);
        NhanVien Cuong = new NhanVien("Nguyễn Đình Cường", 21, "Nguyễn Đình Chiểu", 17000, 150);
        QuanLyNhanVien list = new QuanLyNhanVien();
        list.ThemNhanVien(Nhac);
        list.ThemNhanVien(Long);
        list.ThemNhanVien(Dat);
        list.ThemNhanVien(Huy);
        list.ThemNhanVien(Cuong);
        list.inDS();
    }
    
}
