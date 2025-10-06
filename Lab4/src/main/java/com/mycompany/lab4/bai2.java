/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== BÀI 2: NHẬP 2 SẢN PHẨM ===");

        System.out.println("\n> Sản phẩm 1:");
        SanPham sp1 = new SanPham();
        sp1.nhap(sc);

        System.out.println("\n> Sản phẩm 2:");
        SanPham sp2 = new SanPham();
        sp2.nhap(sc);

        System.out.println("\n=== THÔNG TIN 2 SẢN PHẨM ===");
        sp1.xuat();
        sp2.xuat();

        sc.close();
    }
}

