package day13_MethodOlusturma;

import java.util.Scanner;

public class C04_MethodKullanma {
    public static void main(String[] args) {
        // Kullanicidan 10 dan kücük iki pozifitf tam sayi alip
        // faktoryel degerlerini toplayin

        Scanner scan = new Scanner(System.in);
        System.out.println("10 dan kücük iki adet pozitif tam sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int sonuc = C03_Faktoryel.faktoriyelHesapla(sayi1) + C03_Faktoryel.faktoriyelHesapla(sayi2);
        System.out.println(sonuc);
    }
}
