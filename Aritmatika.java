package projekpertama;

import java.util.Scanner;



public class Aritmatika {
    public static void main(String[] args) {
        int jam, sisajam, menit, masukan, detik;
        Scanner input = new Scanner(System.in);
        System.out.println("pengkonversian waktu");
        System.out.println("--------------------");
        System.out.println("Masukan nilai detik : ");
        masukan = input.nextInt();
        jam = masukan / 3600;
        sisajam = masukan / 3600;
        menit = (sisajam ) / 60;
        detik = sisajam%60;
        System.out.println("Hasil Konversi = " + jam + "jam" + " _ " + menit + "menit" + " _ " + detik + "detik");
        
    }
    
}
