package day14_MethodOverloading_WhileLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan bir sifre isteyin
        // asagidaki sartlari saglayana kadar yeni sifre girmesini isteyin
        // her seferinde hatalari söyleyip yeni sifre isteyin
        // sartlari saglayan yeni sifre oldugunda
        // messela "5. denemenizde basarili sifre olusturuldu"
        // seklinde aciklama yazin
        // - ilk harf kücük harf olmali
        // - son harf buyuk harf olmali
        // - bosluk icermemeli ve
        // - en az sekiz karakter olmali

        Scanner scan = new Scanner(System.in);

        String sifre = "";
        int flag = 0;
        int denemesayisi = 0;

        while (flag!=4) {
            flag=0;

            System.out.println("Lütfen sifrenizi giriniz : ");
            sifre = scan.nextLine();

            if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z') {
                flag ++;
            } else {
                System.out.println("ilk karakter kücük harf olmali ");
            }

            if (sifre.charAt(sifre.length()-1)>='A' && sifre.charAt(sifre.length()-1)<='Z') {
                flag++;
            } else {
                System.out.println("son karakter büyük harf olmali");
            }

            if (sifre.contains(" ")) {
                System.out.println("sifre bosluk katrakteri icermemeli");
            } else {
                flag++;
            }

            if (sifre.length()>=8) {
                flag++;
            } else {
                System.out.println("sifrenizin uzunlugu en az sekiz karakter olmali ");
            }

            denemesayisi++;
        }

        System.out.println("Tebrikler " + denemesayisi + ". denemenizde sifreniz basarili olarak olusturulmustur");
    }
}
