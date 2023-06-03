package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C06_ifElseStatements {

    public static void main(String[] args) {

        // Soru 3 - Kullanicidan yasini isteyin
        //          65 yas ve üzeri ise "Emekli olabilirsin" yazdir
        //          yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Lütfen yasinizi giriniz : ");
        int yas = scan.nextInt();

        if (yas>=65) {
            System.out.println("Mevcut Emeklilik Kanununa göre emeklilik yasina ulasmis oldugunuz görülmektedir." +
                    "\nEmekli olabilirsiniz ");
        } else {

            System.out.println("Emekli olmabilmenniz icin daha " + (65-yas) + " yil calismalisin");
        }
    }
}
