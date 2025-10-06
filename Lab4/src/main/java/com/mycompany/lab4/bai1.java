/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SanPham sp = new SanPham();

        System.out.println("=== BÀI 1: NHẬP/XUẤT SẢN PHẨM ===");
        sp.nhap(sc);
        sp.xuat();

        sc.close();
    }
}


