package day13_MethodOlusturma;

import java.util.Scanner;

public class C02_MethodOlusturma {
    public static void main(String[] args) {
        // Kullanicidan iki sayi alip
        // toplamlarini yazdiran bir method olusturun

        ikiSayiyiTopla();
        ikiSayiyiTopla();

    }

    public static void ikiSayiyiTopla(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" Toplamak üzere 2 sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println(" iki sayinin toplami : " + (sayi1+sayi2));
    }
}
