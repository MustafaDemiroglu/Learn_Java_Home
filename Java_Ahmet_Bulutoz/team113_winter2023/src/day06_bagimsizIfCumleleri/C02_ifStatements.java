package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C02_ifStatements {

    public static void main(String[] args) {

        // Soru 1 - Kullnicidan bir sayi isteyin
        //          sayiyi kontrol edip 5 ile böl+bebiliyorsa sayi 5 ile bölünür yazdirin

        Scanner scan = new Scanner (System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        if(sayi%5 == 0) {
            System.out.println("sayi 5'in tam kati");
        }
    }
}