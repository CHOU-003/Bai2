/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlygiaodich;

import java.util.ArrayList;
/**
 *
 * @author DINH CHAU
 */
abstract class HeThongGiaoDich {
    protected String Magiaodich;
    protected String Ngaygiaodich;
    protected double Dongia;
    protected int Soluong;
    protected double Tien;

    public HeThongGiaoDich(String Magiaodich, String Ngaygiaodich, double Dongia, int Soluong) {
        this.Magiaodich = Magiaodich;
        this.Ngaygiaodich = Ngaygiaodich;
        this.Dongia = Dongia;
        this.Soluong = Soluong;
        this.Tien = 0;
    }

    public String getMagiaodich() {
        return Magiaodich;
    }

    public String getNgaygiaodich() {
        return Ngaygiaodich;
    }

    public double getDongia() {
        return Dongia;
    }

    public int getSoluong() {
        return Soluong;
    }

    public double getTien() {
        return Tien;
    }
    
    public void Tien(){
        System.out.println("Thanh tien khi giao dich cua cac loai.");
    }
    
}
