/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> danhsach = new ArrayList<>();
  
    public void themChuyenXe(ChuyenXe cx)
            
    {
        danhsach.add(cx);
    }
    
    public void inDanhSach()
    {
        for(ChuyenXe i : danhsach)
        {
            i.Xuat();          
        }
    }
    public double TinhTongDoanhThuNoiThanh()
    {
        double  S=0;
        for(ChuyenXe i : danhsach)
        { 
            if(i instanceof XeNoiThanh)
            {
                S=S + i.getdoanhthu();
            }
        }
        return S;
    }
    public double TinhTongDoanhThuNgoaiThanh()
    {
        double  S=0;
        for(ChuyenXe i : danhsach)
        { 
            if(i instanceof XeNgoaiThanh)
            {
                S=S + i.getdoanhthu();
            }
        }
        return S;
    }
    
}
