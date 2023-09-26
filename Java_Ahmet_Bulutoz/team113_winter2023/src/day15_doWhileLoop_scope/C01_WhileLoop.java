package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        // While Loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scan = new Scanner(System.in);
        System.out.println("Rakamlari toplanacak pozitif tamsyi giriniz");
        int girilenSayi = scan.nextInt();

        int sayi = girilenSayi;

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        while(sayi>0) {
            birlerBasamagi = sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;
        }

        System.out.println("girdiginiz sayi: "+ girilenSayi+ " 'nin rakamlar toplami: " + rakamlarToplami );
        System.out.println("Method ile bulunan cözüm");
        System.out.println("girdiginiz sayi: "+ girilenSayi+ " 'nin rakamlar toplami: " + C02_RakamlarToplaminiBul.rakamlarTopaminiBul(girilenSayi));
    }

}
