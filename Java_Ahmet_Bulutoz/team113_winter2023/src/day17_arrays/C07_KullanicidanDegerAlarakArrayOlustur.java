package day17_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_KullanicidanDegerAlarakArrayOlustur {
    public static void main(String[] args) {
        // kulllanicidan array olusturmak üzere pozitif tamsayilar alin
        // Kullaniciya islemi bitirmessi icin 0 a basmasi gerektigini söyleyin
        // bir öncek classa da n method kullanarak aldiginiz elementleri arre ekleyin

        Scanner scan = new Scanner(System.in);
        int girilenSayi = 1;
        int[] arr = new int[0]; // []

        while (girilenSayi != 0) {
            System.out.println("Array e eklemek icin pozitif tam sayilar girin " +
                    "\nislemi bitirmek icin  0 a  basiniz");
            girilenSayi = scan.nextInt();

            if (girilenSayi != 0 ) {
                arr = C06_ArrayElemanEklemeMethodu.arrayeElementEkleMethodu(arr,girilenSayi);
            }
        }

        System.out.println("Olusturdugunuz Array asagidaki gibidir");
        System.out.println(Arrays.toString(arr));
    }
}
