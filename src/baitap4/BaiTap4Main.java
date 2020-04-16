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
public class BaiTap4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bai Tap 4");
        ChuyenXe HaNoi = new XeNoiThanh("AB1", 10, "HN01", "Nguyễn Văn A", "79-A1234", 50000);
        ChuyenXe QuyNhon = new XeNoiThanh("AB2", 15, "QN01", "Nguyễn Văn B", "79-B1234", 60000);
        ChuyenXe DaLat = new XeNoiThanh("AB3", 20, "DL01", "Nguyễn Văn C", "79-C1234", 40000);
        ChuyenXe NhaTrang = new XeNgoaiThanh("NhaTrang", 7, "NT01", "Nguyễn Văn F", "79-C1234", 300000);
        ChuyenXe HCM = new XeNgoaiThanh("HCM", 5, "HCM01", "Nguyễn Văn D", "79-C1234", 150000);
        ChuyenXe BinhThuan = new XeNgoaiThanh("BThuan", 6, "BT01", "Nguyễn Văn E", "79-C1234", 200000);
        QuanLyChuyenXe ds = new QuanLyChuyenXe();
        ds.themChuyenXe(HCM);
        ds.themChuyenXe(HaNoi);
        ds.themChuyenXe(QuyNhon);
        ds.themChuyenXe(DaLat);
        ds.themChuyenXe(NhaTrang);
        ds.themChuyenXe(BinhThuan);
        ds.inDanhSach();
        //Tổng doanh thu
        System.out.println("Tổng Doanh Thu Nội Thành: " + ds.TinhTongDoanhThuNoiThanh());
        System.out.println("Tổng Doanh Thu NGoại Thành: " + ds.TinhTongDoanhThuNgoaiThanh());
        System.out.println("Tổng Doanh Thu Nội+Ngoại Thành: " + (ds.TinhTongDoanhThuNgoaiThanh()+ds.TinhTongDoanhThuNoiThanh()));
        
    }
    
}
