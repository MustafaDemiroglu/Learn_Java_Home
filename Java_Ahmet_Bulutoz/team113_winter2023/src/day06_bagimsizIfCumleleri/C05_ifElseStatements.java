package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C05_ifElseStatements {

    /*
     * Eger bir olay icin
     * sadece 2 olasilik varsa
     * ve bu olasiliklardan birisi mutlaka calisacaksa
     * if else statement kullaniriz
     *
     * if-else statement da if body si veya else body si mutlaka calisir
     * ikisinin birden calisma ihtimai yoktur
     * ikisinide calismama ihtimali yoktur
     *
     */

    public static void main(String[] args) {
        // Soru 5 - Kullanicidan notunu alin
        //          50 veya daha büyükse "Sinifi gectin" 50'den kücükse "Mallesef kaldirin"
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen notunuzu giriniz");

        double not = scan.nextDouble();

        if (not>=50 &&  not<=100) {
            System.out.println("Sinifi gectin");
        } else {
            System.out.println("Maalesef kaldin");
        }


        // Kullanicidan pozitif bir tamsayi alin
        System.out.println("Lütfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        // bu sayinin tek veya cift oldugunu yazdirin
        if (sayi%2==0) {
            System.out.println("Girdiginiz sayi cift sayidir");
        } else {
            System.out.println("Girdiginiz sayi tek sayidir45");
        }

        // bu sayinin 5 ile bölünüp bölünmedigini yazdirin
        if (sayi%5==0) {
            System.out.println("Girdiginiz sayi 5 in katidir");
        } else {
            System.out.println("Girdiginiz sayi 5 in kati degildir");
        }


    }

}
