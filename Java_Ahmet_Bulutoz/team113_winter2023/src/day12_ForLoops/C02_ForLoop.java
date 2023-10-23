package day12_ForLoops;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        // Soru 3 - Kullanicidan baslangic ve bitis degerini alarak pozitif sayilar alin
        // sinirlar dahil oarak aralarindaki tüm sayilari toplamini yazdirin
        // Bitids degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        int bas;
        int bit;
        int top = 0;
        int top1 = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen baslangic degeri olarak \nbir pozoitif tamsayi giriniz");
        bas = scan.nextInt();

        System.out.println("Lütfen bitis degeri olarak \npozitif bir tamsayi giriniz");
        bit = scan.nextInt();

        scan.close();

        System.out.println("-----------Benim cözümüm -------");
        // Benim cözümüm
        for (int i = bas; i <= bit ; i++) {
            if (bit > bas) {
                top = top+i;
            } else {
                System.out.println("hatali giris yaptiginiz icin bu islemi sonlandimak zorundayim");
            }
        }
        System.out.println("Girmis oldugunuz pozitif sayilar arasindaki \ntüm pozitif tamsayilar toplami : "+top);

        System.out.println("-----------Hocanin cözümü--------------");
        if (bit < bas) {
            System.out.println("Baslangic degeri bitis degerinden kücük olmalidir");
        } else {
            for (int j = bas; j <= bit ; j++) {
                // sayiToplami = sayiToplami + i ;
                top1+=j;
            }
            System.out.println("Sayilarin toplami: "+ top1);
        }


    }
}
