package day21_arrayList_forEachLoop;

import java.util.Arrays;

public class C05_istenenHarfAdediniBulma {
    public static void main(String[] args) {

        // Kullanicidan bir cümle bir harf alin
        // harf cümlede kullanilmis ise kac kere kullanildigini yazdirin
        // kullanimadiysa "harf cümlede kullanilmamis" yazdirin

        String cumle = "Yatin kalkin Java calisin";
        String istenenHarf = "a";

        String[] karakterler = cumle.split("");
        System.out.println("Array : " + Arrays.toString(karakterler));

        int sayac = 0;
        for (String each: karakterler) {
            if (each.equalsIgnoreCase(istenenHarf)) {
                sayac ++;
            }
        }
        if (sayac ==0) {
            System.out.println("Istenen Harf " + istenenHarf + " cümlede kullanilmamistir");
        } else {
            System.out.println("Istenen harf " + istenenHarf + " cümlede " + sayac + " adet kullanilmistir");
        }
    }
}
