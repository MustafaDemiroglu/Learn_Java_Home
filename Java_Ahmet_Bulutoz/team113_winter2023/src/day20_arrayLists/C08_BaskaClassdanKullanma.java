package day20_arrayLists;

import java.util.List;
import java.util.Scanner;

public class C08_BaskaClassdanKullanma {
    public static void main(String[] args) {
        // verilen sayinin pozotof tam bölenleri sayisi
        // 10 dan cok ise güzel
        // 10 dan kücük ise kotu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bölenlerinin bulmak istediginiz bir pozfitf tam sayi giriniz : ");
        int girilenSayi = scan.nextInt();

        List<Integer> pozitifBolenlerListesi = C07_tamBolenlerListesi.pozitifTamBolenleriListelemeMethodu(girilenSayi);

        if (pozitifBolenlerListesi.size() >= 10) {
            System.out.println("Güzel bir sayi girdiniz");
            System.out.println("iste tam bölenler listeniz : " + pozitifBolenlerListesi);
        } else {
            System.out.println("Maalesef Kötü bir sayi girdiniz");
            System.out.println("iste tam bölenler listeniz : " + pozitifBolenlerListesi);
        }

    }
}
