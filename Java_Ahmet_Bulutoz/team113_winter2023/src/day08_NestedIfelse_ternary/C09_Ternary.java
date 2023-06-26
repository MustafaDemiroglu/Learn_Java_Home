package day08_NestedIfelse_ternary;

import java.util.Scanner;

public class C09_Ternary {

    public static void main(String[] args) {

        // Kullanicidan iki sayi isteyin
        // büyük olan sayiyi ekrana yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("1. sayiyi giriniz");
        int a = scan.nextInt();

        System.out.println("2. sayiyi giriniz");
        int b = scan.nextInt();

        System.out.println("Büyük olan sayi : " + (a>b?a:b));
        System.out.println("Kücük olan sayi : " + (a>b?b:a));

    }
}
