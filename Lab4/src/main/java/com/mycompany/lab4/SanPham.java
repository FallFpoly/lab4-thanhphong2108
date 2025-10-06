/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author Phong
 */
import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham() {
    }

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public void nhap(Scanner sc) {
        System.out.print("Tên sản phẩm: ");
        this.tenSp = sc.nextLine();
        System.out.print("Đơn giá: ");
        this.donGia = sc.nextDouble();
        System.out.print("Giảm giá: ");
        this.giamGia = sc.nextDouble();
        sc.nextLine(); // bỏ dòng trống
    }

    private double getThueNhapKhau() {
        return this.donGia * 0.10;
    }

    public void xuat() {
        System.out.println("----- THÔNG TIN SẢN PHẨM -----");
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
}
