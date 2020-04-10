/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Administrator
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bai Tap 1");
        NhanVien Dat= new NhanVien("đạt", 21, "phạm văn đồng", 20000,250);
        NhanVien Long= new NhanVien("long", 21, "phạm văn đồng", 30000,150);
        System.out.println(Dat.getThongTin());
         System.out.println(Long.getThongTin());
        
    }
    
}
