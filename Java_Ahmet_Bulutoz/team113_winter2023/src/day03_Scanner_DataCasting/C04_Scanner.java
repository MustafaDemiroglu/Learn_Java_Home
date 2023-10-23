// Soru 7 : (Interview) Kullanicidan iki sayiyi alip  ikisinin degerlerini degistirin (Swap)
// Kullanici sayi1=10, sayi2=20 degeri girdiginde
// sayi1 in degeri =20 , sayi2 nin yeni degeri = 10 olarak görülmeli

package day03_Scanner_DataCasting;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Sayi1'i tamsayi olarak giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Sayi2'i tamsayi olarak giriniz");
        int sayi2 = scan.nextInt();

        int temp=0;
        temp = sayi2;
        sayi2=sayi1;
        sayi1=temp;
        temp=0;

        System.out.println("Sayi 1 in yeni degeri : " + sayi1);
        System.out.println("Sayi 2 nin yeni degeri : " + sayi2);

    }
}
