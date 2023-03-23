/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlygiaodich;

import java.util.ArrayList;
/**
 *
 * @author DINH CHAU
 */
public class QuanLyGiaoDich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HeThongGiaoDich> htgds = new ArrayList<HeThongGiaoDich>();
        
        // Phải ghi đúng thứ tự đã khai báo bên các class
        htgds.add(new GiaoDIchTienTe(50000, "USD", "MB5", "21-2-2003", 3.2, 5));
        htgds.add(new GiaoDIchTienTe(30000, "VN", "MA25", "21-2-2143", 3, 5));
        htgds.add(new GiaoDIchTienTe(70000, "VN", "PO25", "1-7-2143", 7, 2));
        htgds.add(new GiaoDichVang("78k", "GH2", "2-3-12023", 2.2, 2));
        htgds.add(new GiaoDichVang("51k", "pl2", "2-3-1223", 3.6, 5));
        htgds.add(new GiaoDichVang("98k", "jH2", "2-4-7899023", 5.3, 7));
    }
    int TienVang = 0;
        int TienTe = 0;
        for (HeThongGiaoDich htgd : htgds) {
            if (htdg instanceof   GiaoDichVang) {
                TienVang += htgd.getDongia();
		} else if (htgd instanceof GiaoDIchTienTe) {

		TienTe += htgd.getDongia();
            }
}
    System.out.println("Ket qua vang: " + TienVang);
    System.out.println("Ket qua tien te: : " + TienTe);
}
