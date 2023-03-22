/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DINH CHAU
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      DanhSachHinh dsh = new DanhSachHinh();
        int chon = 0 ;
        
        do {
            System.out.println("-----------Menu----------");
            System.out.println("Chon chuc nang");
            System.out.println("0. Thoat khoi man hinh nhap.\n"
            + "1. Them Hinh vao danh sach.\n"
            + "2. Xuat danh sach.\n");
            System.out.print("Lua chon cua ban la: ");
          chon = sc.nextInt();
          sc.nextLine();
          
            if(chon ==0){}
            else if(chon == 1){
                System.out.println("Nhap chieu dai: "); float cd = sc.nextFloat();
                System.out.println("Nhap chieu rong: "); float cr = sc.nextFloat();
                System.out.println("Nhap ban kinh: "); float t = sc.nextFloat();
                Hinh ht = new Hinh();
                dsh.AddHinh(ht);
            }
            else if(chon == 2){
                dsh.xuat();
            }
            
        } while (chon !=0);
        
        Hinh hh = new Hinh();
        hh.dienTich();
        
        hh = new HinhTron();
        hh.dienTich();
        
        hh = new HinhChuNhat();
        hh.dienTich();
        
    }
    
}
