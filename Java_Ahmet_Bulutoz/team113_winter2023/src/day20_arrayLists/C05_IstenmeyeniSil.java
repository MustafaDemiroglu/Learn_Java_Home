package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_IstenmeyeniSil {
    public static void main(String[] args) {
        // verilen string bir listede
        // istenmeyen harf iceren elementleri silip
        // kalan kismini list olarak bize döndüren bir method olusturun

        List<String> liste = C04_KullaniciyaListeOlusturtmak.kullaniciyaListOlusturtmaMethodu();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kullanilmasini istemediginiz bir harf girin : ");
        String istenmeyenHarf = scan.next().substring(0,1);

        List<String> ayiklanmisList = istenmeyenHarfIcerenleriSilMethodu(liste, istenmeyenHarf);
        System.out.println(ayiklanmisList);
    }

    public static List<String> istenmeyenHarfIcerenleriSilMethodu(List<String> liste, String istenmeyenHarf) {
        List<String> kalanlarListesi = new ArrayList<>();

        for (int i = 0; i < liste.size() ; i++) {

            if (!liste.get(i).contains(istenmeyenHarf)) {
                kalanlarListesi.add(liste.get(i));
            }
        }

        return kalanlarListesi;
    }


}
