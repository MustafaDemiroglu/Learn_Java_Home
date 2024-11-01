package day15_DoWhileLoop_Scope;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        // Kullanicidan kullanmak üzere sayilar alin
        // Kullaniciya bitirmek icin '0' a basmasinin söyleyin
        // kullanici 0 a bastiginda
        // 0 haric kac sayi girdigini ve toplmlari yazdirin

        Scanner scan = new Scanner(System.in);

        /*
        int girilenSayi = 1;
        int toplam = 0;
        int sayiAdedi= 0;

        while (girilenSayi !=0) {
            System.out.println("Toplanmak üzere tam sayi giriniz " +
                    "\nBitirmek icin 0'a basiniz ");
            girilenSayi = scan.nextInt();

            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayiAdedi ++;
            }
        }

        System.out.println("Girilen " + sayiAdedi + " adet sayinin toplamli " + toplam);
        */

        // ayni kodu do while olarak yazacak olursak

        int girilenSayi = 0;
        int toplam = 0;
        int sayiAdedi= 0;

         do {
            System.out.println("Toplanmak üzere tam sayi giriniz " +
                    "\nBitirmek icin 0'a basiniz ");
            girilenSayi = scan.nextInt();

            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayiAdedi ++;
            }
        } while (girilenSayi !=0);

        System.out.println("Girilen " + sayiAdedi + " adet sayinin toplamli " + toplam);


    }
}
