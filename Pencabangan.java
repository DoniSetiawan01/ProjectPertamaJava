/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpertama;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Pencabangan {
    public static void main(String[] args){
         Scanner masukan = new Scanner (System.in);
         System.out.println("Masukan");
         int angka = masukan.nextInt();
         if (angka%2==0){
             System.out.println("Angka "+ angka + "bilangan");
             System.out.println("Bilangan genap");
         } else {
             System.out.println("Angka "+ angka + "bilangan");
             System.out.println("bilangan genap");
         }
         String hasil = angka%2==0 ? "Bilangan genap":"Bilangan ganjil";
         System.out.println(hasil);
    }
}
