package day18_MultiDimensionalArrays;

import java.util.Arrays;

public class C02_StringSplitMethodu {
    public static void main(String[] args) {
        // Bir String i istedigimiz parcalara ayirmak icin kullanilir
        String str = "Java candir can.";
        // str kac kelimedir?
        System.out.println("Cümledeki karakter sayisi : " + str.length());

        String[] kelimeler = str.split(" ");
        System.out.println("Ayrildiktan sonra hangi kelimeler var : ");
        System.out.println(Arrays.toString(kelimeler));

        System.out.println("Cümledeki Kelime sayisi : " + kelimeler.length);

        // en uzun kelime kac harflidir?

        int enUzunKelimeLength = kelimeler[0].length();
        String enUzunKelime = kelimeler[0];

        for (String s : kelimeler) {
            if (s.length() > enUzunKelimeLength) {
                enUzunKelimeLength = s.length();
                enUzunKelime = s;
            }
        }
        System.out.println("Cümledeki En uzun kelime : " + enUzunKelime);
        System.out.println("Cümledeki en uzun kelimenin karakter sayisi : " + enUzunKelimeLength);

        // Bir String i karakterlerine ayirmak istersek
        System.out.println("------------------------");
        System.out.println("Bir String i karakterlerine ayirmak istersek ! ");
        String[] karakterler = str.split("");
        System.out.println(Arrays.toString(karakterler));
        System.out.println("Cümledeki karakter sayisi : " + karakterler.length);

    }
}
