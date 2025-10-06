/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
public class bai3 {
    public static void main(String[] args) {
        System.out.println("=== BÀI 3: CONSTRUCTOR & ĐÓNG GÓI ===");

        SanPham sp1 = new SanPham("Laptop Dell", 25000000, 2000000);
        SanPham sp2 = new SanPham("Chuột Logitech", 350000);

        System.out.println("\n> Sản phẩm có giảm giá:");
        sp1.xuat();

        System.out.println("\n> Sản phẩm không giảm giá:");
        sp2.xuat();
    }
}

