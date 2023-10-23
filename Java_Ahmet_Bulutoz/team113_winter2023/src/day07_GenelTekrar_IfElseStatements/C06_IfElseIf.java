package day07_GenelTekrar_IfElseStatements;

import java.util.Scanner;

public class C06_IfElseIf {

    /*
     * Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut
     * kitle endeksini hesaplayin
     * (kilo*10000 / (boy *boy))
     * vucut kitle endeksi 30’dan buyukse obez,
     * 25-30 arasi ise kilolu,
     * 0-25 arasi ise normal,
     * 20’den kucukse zayif yazdirin.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println("Lütfen su anki kilonuzu kg olarak giriniz :  ");
        double kilo = scan.nextDouble() ;

        System.out.println("Lütfen boyunuzu cm olarak giriniz : ");
        double boy = scan.nextDouble();

        double kitleEndeksi = (kilo * 10000 / (boy*boy)) ;
        System.out.println("Vücut Kitle Endeksiniz : " + kitleEndeksi);

        if (kilo<=0 || boy <=0 || boy >300 || kilo >300) {
            System.out.println("Yanlis giris yaptiniz lütfen tekrar giris yapiniz");
        } else if (kitleEndeksi<20) {
            System.out.println("zayifsiniz");
        } else if (kitleEndeksi<25) {
            System.out.println("normalsiniz");
        } else if (kitleEndeksi<30) {
            System.out.println("kilolu");
        } else {
            System.out.println("obez");
        }
    }


}
