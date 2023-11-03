package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_tamBolenlerListesi {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir tamsayi alip
        // o tamsayiyi tam bölebilen tüm pozitif tamsayilari
        // bir liste olrk bize döndüren bir method olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bölenleri bulunacak pozitif bir tamsayi giriniz :");
        int girilenSayi = scan.nextInt();

        System.out.println(pozitifTamBolenleriListelemeMethodu(girilenSayi));

    }

    public static List<Integer> pozitifTamBolenleriListelemeMethodu(int verilensayi) {
        List<Integer> pozitifBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <verilensayi ; i++) {
            if (verilensayi % i == 0) {
                pozitifBolenlerListesi.add(i);
            }
        }
        return pozitifBolenlerListesi;
    }
}
