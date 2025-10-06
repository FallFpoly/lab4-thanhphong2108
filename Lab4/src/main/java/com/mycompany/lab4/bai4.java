/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SanPham sp = new SanPham();

        System.out.println("=== BÀI 4: GETTER/SETTER ===");
        System.out.print("Nhập tên sản phẩm: ");
        String ten = sc.nextLine();

        System.out.print("Nhập đơn giá: ");
        double gia = sc.nextDouble();

        System.out.print("Nhập giảm giá: ");
        double giam = sc.nextDouble();

        sp.setTenSp(ten);
        sp.setDonGia(gia);
        sp.setGiamGia(giam);

        System.out.println("\n--- Thông tin qua getter ---");
        System.out.println("Tên SP: " + sp.getTenSp());
        System.out.println("Giá: " + sp.getDonGia());
        System.out.println("Giảm giá: " + sp.getGiamGia());

        System.out.println("\n--- Xuất bằng phương thức xuat() ---");
        sp.xuat();

        sc.close();
    }
}
