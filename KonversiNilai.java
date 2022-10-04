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
public class KonversiNilai {
    public static void main(String[] args){
        String nim, nama, matkul, prodi;
        String grade = "";
        int nilai;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan nim =");
        nim = masukan.nextLine();
        System.out.print("Masukan nama Mahasiswa = ");
        nama= masukan.nextLine();
        System.out.println("program studi = ");
        prodi = masukan.nextLine();
         switch (prodi){
            case "52" :
                System.out.println("S1-TI");
                break;
            case "51" :
                System.out.println("S1-SI");
                break;
            case "31" :
                System.out.println("D3-SI");
                break;
            default :
                System.out.println("prodi Tidak ditemukan");
        }
        System.out.print("Mata kuliah = ");
        matkul = masukan.nextLine();
        System.out.println("masuka nilai angka = ");
        nilai = masukan.nextInt();
        if (nilai >= 85) {
            grade = "A";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 80) {
            grade = "A-";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 75) {
            grade = "B+";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 70) {
            grade = "B";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 65) {
            grade = "B-";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 60) {
            grade = "C+";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 55) {
            grade = "C";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 50) {
            grade = "C-";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai >= 45) {
            grade = "D";
            System.out.println("Grade nilai siswa : " + grade);
        } else if (nilai <=40) {
            grade = "E";
            System.out.println("Grade nilai siswa : " + grade);
        } else {
            System.out.println("Inputan anda tidak sesuai !");
        }
        switch (grade) {
            case "A":
                System.out.println("Sangat Memuaskan");
                break;
            case "A-":
                System.out.println("Sangat Memuaskan");
                break;
            case "B+":
                System.out.println("Memuaskan");
                break;    
            case "B":
                System.out.println("Memuaskan");
                break;    
            case "B-":
                System.out.println("Memuaskan");
                break;    
            case "C+":
                System.out.println("Cukup");
                break;    
            case "C":
                System.out.println("Cukup");
                break;    
            case "C-":
                System.out.println("Cukup");
                break;    
            case "D":
                System.out.println("Kurang");
                break;    
            case "E":
                System.out.println("Sangat Kurang");
                break;    
            default:
                break;
        }
        System.out.println("====Hasil pengolahan Data====");
        //====mengambil jurusan dari nim
//        prodi = nim.substring(3, 5);
//        System.out.print(prodi);
//        if (prodi.equals("52")){
//            System.out.println("S1-TI");
//        }else if (prodi.equals("S1")){
//            System.out.println("S1-SI");
//            }else if (prodi.equals("31")){
//                System.out.println("D3-SI");
//                 }else {
//                System.out.println("Prodi Tidak Dikenali");
//            }
       
    }
    
}
