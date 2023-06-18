package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_ScannerIlkGorev {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz");

        double girilenSayi= scan.nextDouble();

        System.out.println("girmis oldugunuz sayi : " + girilenSayi);
        System.out.println("Girdiginiz sayinin karesi : " + girilenSayi*girilenSayi);


    }
}
