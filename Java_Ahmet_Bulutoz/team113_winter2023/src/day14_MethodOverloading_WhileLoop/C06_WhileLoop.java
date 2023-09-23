package day14_MethodOverloading_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // Kullanicidan toplanmak üzere sayilar alin
        // Toplam 500 olunca veya 500 ü asinca
        // kac sayi girdigini ve sayilarin toplamini yazdirin

        Scanner scan= new Scanner(System.in);


        int girilenSayi = 0 ;
        int toplam = 0 ;
        int girilenSayiAdedi = 0 ;

        while (toplam<500){     // Toplam 500 den kücük oldugu süre boyunca
            System.out.println("Su ana kadar " + girilenSayiAdedi + " adet tam sayi girdiniz");
            System.out.println("Simdiye kadar girmis oldugunuz sayilar toplami : " + toplam);
            System.out.println("Toplanmak üzere bir tamsayi giriniz : ");
            girilenSayi = scan.nextInt();
            toplam+=girilenSayi;
            girilenSayiAdedi++;
        }

        System.out.println(girilenSayiAdedi + " defa sayi girisi yaptiniz " +
                "\nve girdiginiz sayilarin toplami :  " + toplam);

    }
}
