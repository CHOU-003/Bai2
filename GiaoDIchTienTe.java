/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlygiaodich;

/**
 *
 * @author DINH CHAU
 */
public class GiaoDIchTienTe extends HeThongGiaoDich{
    private double  Tigia;
    private String LoaiTien;

    public GiaoDIchTienTe(double Tigia, String LoaiTien, String Magiaodich, String Ngaygiaodich, double Dongia, int Soluong) {
        super(Magiaodich, Ngaygiaodich, Dongia, Soluong);
        this.Tigia = Tigia;
        this.LoaiTien = LoaiTien;
    }

    
    /**
     *
     */
    @Override
    public void Tien(){
        if(LoaiTien.equals("USD") || LoaiTien.equals("Euro")){
        double ThanhTien = Soluong * Dongia * Tigia;}
        else{
            double ThanhTien = Soluong * Dongia;
        }
    }

    public double getTigia() {
        return Tigia;
    }

    public String getLoaiTien() {
        return LoaiTien;
    }
    
}
