package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C02_ifStatements {

    public static void main(String[] args) {

        // Soru 1 - Kullanicidan herhangi bir tamsayi isteyin
        //          sayiyi kontrol edip 5 ile bölünebiliyorsa sayi 5 ile bölünür yazdirin

        Scanner scan = new Scanner (System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        if(sayi%5 == 0) {
            System.out.println("sayi 5'in tam kati");
        }

        // Soru 3 - Kullanicidan bir sayi alin
        // sayiyi kontrol edip 3 ile böl+bebiliyorsa sayi 3 ile bölünür yazdirin

        if(sayi%3 == 0) {
            System.out.println("sayi 3'ün tam kati");
        }


    }
}
