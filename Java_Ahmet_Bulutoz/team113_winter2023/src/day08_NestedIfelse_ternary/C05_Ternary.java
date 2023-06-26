package day08_NestedIfelse_ternary;

import java.util.Scanner;

public class C05_Ternary {

    public static void main(String[] args) {

        // kullanicidan bir tamsayi alip
        // mutlak degerine cevirin
        // ekrana yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz : ");
        int sayi = scan.nextInt();

        System.out.println("------- if else -------");

        if (sayi >= 0) {
            System.out.println(sayi);
        } else {
            sayi=sayi*(-1);
            System.out.println(sayi);
        }



        System.out.println("--------- ternary --------------");
        System.out.println(sayi>=0? sayi:sayi*(-1));

    }
}
