package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C08_ifElseStatements {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir harf isteyin
        //         girilen karakter kücük ise onu büyük harf olarak yazdirin
        //         yoksa girilen karakteri yazdirin

        Scanner scan = new Scanner(System.in) ;

        System.out.println("Lütfen bir karakter giriniz");

        char krk = scan.next().charAt(0) ;

        if ('a'<=krk && krk<='z') {
            System.out.println(Character.toUpperCase(krk));
        } else {
            System.out.println(krk);
        }

    }
}
