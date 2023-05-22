package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C05_SayininRakamlarToplaminiBulma {

    public static void main(String[] args) {

        // Kullnicidan 3 basamakli bir sayi alalim
        // ve sayinin rakamlar toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli pozitif bir tamsayi giriniz");
        int girilenSayi = scan.nextInt();   //  135

        int rakam1 = (girilenSayi) % 10 ;
        int rakam2 = (girilenSayi/10) % 10 ;
        int rakam3 = ((girilenSayi/10)/10) %10 ;
        int girilenSayiRakamlarToplami = rakam1 + rakam2 + rakam3 ;

        System.out.println("rakam1 :" + rakam1);
        System.out.println("rakam2 :" + rakam2);
        System.out.println("rakam3 :" + rakam3);
        System.out.println("Girmis oldugunuz sayinin rakamlar toplami : " + girilenSayiRakamlarToplami);


    }
}
