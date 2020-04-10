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
public class NhanVien {
    String ten;
    int tuoi;
    String diachi;
    double TienLuong;
    int TongSoGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diachi, double TienLuong, int TongSoGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.TienLuong = TienLuong;
        this.TongSoGioLam = TongSoGioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getTienLuong() {
        return TienLuong;
    }

    public void setTienLuong(double TienLuong) {
        this.TienLuong = TienLuong;
    }

    public int getTongSoGioLam() {
        return TongSoGioLam;
    }

    public void setTongSoGioLam(int TongSoGioLam) {
        this.TongSoGioLam = TongSoGioLam;
    }
    
    // hàm  tính tiền thưởng
    public double TinhThuong(){
        double TienThuong = 0;
        
        if(TongSoGioLam>=200) TienThuong=TienLuong*0.2;
        if(TongSoGioLam<200&&TongSoGioLam>=100) TienThuong=TienLuong*0.1;
        if(TongSoGioLam<100) TienThuong=0;
        return TienThuong;
     // hàm lấy thông tin   
    }
    public String getThongTin(){
        return "Tên Nhân Viên: "+ten +"\n"+
                "Tuổi: "+tuoi +"\n"+
                "địa chỉ: "+diachi +"\n"+
                "Tiền Lương: "+TienLuong +"\n"+
                "Tổng Số Giờ Làm: "+TongSoGioLam + "\n"+
                "Tiền Thưởng: "+TinhThuong();
    }
     
    
}
