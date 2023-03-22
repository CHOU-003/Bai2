/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DINH CHAU
 */
public class DanhSachHinh {
    private ArrayList<Hinh> DanhSach;

    
    public void DanhSachHinh(){
        this.DanhSach = new ArrayList<>();
    }
    
    public DanhSachHinh(ArrayList<Hinh> DanhSach){
        super();
        this.DanhSach = DanhSach;
    }
    
    public void xuat()
    {
        for(Hinh h : DanhSach)
        {
            System.out.println(h);
        }
    }
     public void  AddHinh(Hinh ht){
        this.DanhSach.add(ht);
    }
}
