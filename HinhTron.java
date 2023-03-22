/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author DINH CHAU
 */
public class HinhTron extends Hinh{
    public float t;
    
    public HinhTron(){}
    
    public void HinhTron(float t){
        this.t = t;
    }
    
    
    @Override
    public String toString(){
        return "HinhTron{" + t + "}";
    }
    
    @Override
    public double dienTich(){
        double T = this.t *3.14;
        System.out.println("Dien tich hinh tron la: " + T);
        return T;
    }
}
