// Soru 7 : (Interview) Kullanicidan iki sayiyi alip  ikisinin degerlerini degistirin (Swap)
// Kullanici sayi1=10, sayi2=20 degeri girdiginde
// sayi1 in degeri =20 , sayi2 nin yeni degeri = 10 olarak görülmeli

package day03_dataCasting_WrapperClass;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Sayi1'i tamsayi olarak giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Sayi2'i tamsayi olarak giriniz");
        int sayi2 = scan.nextInt();

        System.out.println("Sayi 1 : " + sayi2);
        System.out.println("Sayi 2 : " + sayi1);

    }
}
