package day08_NestedIfelse_ternary;

import java.util.Scanner;

public class C03_NestedIfElse {

    public static void main(String[] args) {
        /*
         * Kullanicidan cinsiyetini ve yasini alin
         * Kadin 60 yas ve üzeri erkek 65 yas ve üzeri emekli olabilirler
         * cinsiyet ve yasini dikkate alarak emekli olabilirisn
         * veya emekli olabilmek icin su kadar yil daha calisman gerek yazdirin
         * hatali giris yapilirsa kullaniciyi uyarin
         */

        // bu defa ana degisken yas olsun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        double yas = scan.nextDouble();

        System.out.println("lütfen cinsiyetini erkek ise E Kadin ise K olarak giriniz ");
        char cinsiyet = scan.next().charAt(0);

        if (yas <16 || yas>80) {
            System.out.println("Gecersiz yas");
        } else if (yas <60) {
            if (cinsiyet == 'k' || cinsiyet=='K') {
                System.out.println("Emekli olmak icin " + (60-yas) + " yil daha calismalisin");
            } else if (cinsiyet == 'e' || cinsiyet=='E') {
                System.out.println("Emekli olmak icin " + (65-yas) + " yil daha calismalisin");
            } else {
                System.out.println("Gecersiz cinsiyet girisi");
            }
        } else if (yas <65) {
            if (cinsiyet == 'k' || cinsiyet=='K') {
                System.out.println("Emekli olabilirsin");
            } else if (cinsiyet == 'e' || cinsiyet=='E') {
                System.out.println("Emekli olmak icin " + (65-yas) + " yil daha calismalisin");
            } else {
                System.out.println("Gecersiz cinsiyet girisi");
            }
        } else {
            System.out.println("Emekli olabilirsin");
        }

    }
}
