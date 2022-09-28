/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekpertama;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author user
 */
public class ContohBuffer {
    public static void main(String[] args) throws IOException {
        String nama;
        int usia;
        InputStreamReader isr = new InputStreamReader (System.in);
        
        BufferedReader br = new BufferedReader (isr);
        
        System.out.print("Masukkan Nama = ");
        nama = br.readLine();
        System.out.print("Masukan Usia = ");
        usia = Integer.parseInt(br.readLine());
//        usia = br.read();
        System.out.println("Nama mu adalah = "+nama);
        System.out.println("Usia mu adalah = "+usia);
    }
    
}
