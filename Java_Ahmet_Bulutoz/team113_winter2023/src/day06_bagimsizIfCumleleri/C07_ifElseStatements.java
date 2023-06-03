package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C07_ifElseStatements {

    public static void main(String[] args) {

        // Soru 4 - Kullanicidan bir karakter girmesini isteyin ,
        //          girilen karakterin büyük harf olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in) ;
        System.out.println(" Lütfen herhangi bir karakter giriniz :");
        char krk =  scan.next().charAt(0);

        // r ===> A ile Z arasinda mi?

        if ('A'<=krk && krk<='Z') {
            System.out.println("Girmis oldugunuz karakter " + krk + " büyük bir harftir");
        }  else {
            System.out.println("Girmis oldugunuz karakter " + krk + "  büyük bir harf degildir");
        }
    }
}
