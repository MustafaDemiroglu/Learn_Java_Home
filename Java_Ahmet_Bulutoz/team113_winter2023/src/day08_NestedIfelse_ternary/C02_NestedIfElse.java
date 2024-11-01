package day08_NestedIfelse_ternary;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {

        /*
         * Kullanicidan cinsiyetini ve yasini alin,
         * Kadin 60 yas ve üzeri , erkek 65 yas ve üzeri emekli olabilir
         * Cinsiyet ve yasini dikkate alarak "Emekli olabilirsin"
         * veya "Emekli olmak icin  ..... yil daha calisman gerekir" yazdirin
         * hatali giris yapilirsa kullaniciyi uyarin
         */

        // birden fazla degiskene bagli if else statementleri yazarken
        // önce degiskenlerden birine göre ana yapiyi olusturalim
        // bu soruda cinsiyeti ana degisken yapalim

        // ikinci degiskenin her bölümünde ayri ayri degerlendirelim

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen yasinizi giriniz : ");
        double yas = scan.nextDouble();

        System.out.println("Lütfen cinsiyetinizi giriniz....."
                            + "\nKadin icin : K , Erkek icin : E giriniz ");
        char cinsiyet = scan.next().charAt(0);

        if (cinsiyet == 'k'|| cinsiyet =='K') {
            if (yas <16 || yas>80) {
                System.out.println("Gecersiz yas girisi, lütfen tekrar deneyin");
            } else if (yas<60) {
                System.out.println("Emekli olmak icin daha " + (60-yas) + " yil calismalisin");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        } else if (cinsiyet == 'e'|| cinsiyet =='E') {
            if (yas <16 || yas>80) {
                System.out.println("Gecersiz yas girisi, lütfen tekrar deneyin");
            } else if (yas<65) {
                System.out.println("Emekli olmak icin daha " + (65-yas) + " yil calismalisin");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        } else {
            System.out.println("Gecersiz cinsiyet girisi, lütfen yeniden deneyiniz");
        }
    }
}
