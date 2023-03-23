/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlygiaodich;

/**
 *
 * @author DINH CHAU
 */
public class GiaoDichVang extends HeThongGiaoDich{
    private String LoaiVang;

    public GiaoDichVang(String LoaiVang, String Magiaodich, String Ngaygiaodich, double Dongia, int Soluong) {
        super(Magiaodich, Ngaygiaodich, Dongia, Soluong);
        this.LoaiVang = LoaiVang;
    }
    

    public String getLoaiVang() {
        return LoaiVang;
    }


    
    @Override
   public void Tien(){
       double ThanhTien = Soluong * Dongia;
       System.out.println("Giao dich co gia tien la: " + ThanhTien);
   }
   
   
}
