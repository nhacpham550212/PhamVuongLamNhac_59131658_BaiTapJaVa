/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class QuanLyNhanVien implements IQuanLy
{
    ArrayList<NhanVien> danhsach = new ArrayList<>();
    
    public QuanLyNhanVien() {
       
    }
    
    
    @Override
    public void ThemNhanVien(NhanVien nv) 
    {
         danhsach.add(nv);
    }

    @Override
    public void inDS() 
    {
          for(NhanVien i : danhsach)
          {
              System.out.println(i.getThongTin());
          }
    }
    
}
