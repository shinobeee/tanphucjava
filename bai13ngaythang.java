/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class bai13ngaythang {
    public static void main(String[] args) {
        System.out.println("chuong trinh tinh ngay thang");
        Scanner Sc = new Scanner(System.in);
        int thang;
        System.out.println("Nhap thang: ");
        thang = Sc.nextInt();
        switch (thang)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang nay co 31 ngay ");
               break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang nay co 30 ngay ");
               break;
            case 2:
                System.out.println("Thang 2 co 28 ngay");
               break;
             default:
                 System.out.println("Khong co thang nay trong nam");
               break;
        }
    }
}
