/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author DINH CHAU
 */
public class HinhChuNhat extends Hinh{
    public float cd;
    public float cr;
    
    public void HinhChuNhat(){}
    
    public void HinhChuNhat(float cd, float cr){
        this.cd = cd;
        this.cr = cr;
    }
    
    @Override
    public String toString(){
        return  "HinhChuNhat{" + ", cd=" + cd + ", cr=" + cr + "}";
    }
    
    @Override
    public double dienTich(){
        double DT = this.cr * this.cd;
        System.out.println("Dien tich hinh chu nhat: " + DT);
        return  DT;
    }
}
