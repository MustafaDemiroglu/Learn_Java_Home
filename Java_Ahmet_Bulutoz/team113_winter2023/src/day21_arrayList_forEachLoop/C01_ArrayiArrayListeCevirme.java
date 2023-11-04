package day21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayiArrayListeCevirme {
    public static void main(String[] args) {

        Integer[] arr ={3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};
        System.out.println(Arrays.toString(arr));   // [3, 5, 6, 7, 3, 2, 3, 5, 8, 7, 1, 2, 3, 4, 5, 8]
        // arr arrayinin elementlerini iceren bir arrayList olsturun

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar);    // [3, 5, 6, 7, 3, 2, 3, 5, 8, 7, 1, 2, 3, 4, 5, 8]

        /*
            Java da bir array i arrayList e cevirmek icin kullanilan asList() vardir
            ancak kullanimmi tavsiye edilmez, cünkü 2 tane büyük dezavantaji vardir
            1 - asList() kullanilarak array den List e cevrilen listelerde ekleme/silme
                gibi uzunlugu degistiren methodlar kullanilamaz
            2 - Arka planda array ve array e dönüstürdügümüz List beraber hareket eder
                birinde yaptiginiz update lerotekine de islenir
         */

        List<Integer> arraydenList = Arrays.asList(arr);
        System.out.println(arraydenList);   // [3, 5, 6, 7, 3, 2, 3, 5, 8, 7, 1, 2, 3, 4, 5, 8]

        // 1. dezavantaj
        // iki List e de 11 ekleyelim

        sayilar.add(11);
        // arraydenList.add(11);    // UnsupportedOperationException
        System.out.println("Sayilar Listesi          : " + sayilar);
        System.out.println("Array'den Liste cevrilen : " + arraydenList);

        // iki List in de 0 inci indexindeki elementleri silelim
        sayilar.remove(0);
        // arraydenList.remove(0);  // UnsupportedOperationException
        System.out.println("Sayilar Listesi          : " + sayilar);
        System.out.println("Array'den Liste cevrilen : " + arraydenList);

        //2. dezavantaj

        System.out.println("Array          : " + Arrays.toString(arr));
        System.out.println("Array'den List : " + arraydenList);

        // array in bir elementine yeni bir deger atayalim

        arr[0]=22;
        System.out.println("===== array i degistirdikten sonra ======");
        System.out.println("Array          : " + Arrays.toString(arr));
        System.out.println("Array'den List : " + arraydenList);

        // List in bir elementini update edelim

        arraydenList.set(1,45);
        System.out.println("==== List i degistirdikten sonra ====");
        System.out.println("Array          : " + Arrays.toString(arr));
        System.out.println("Array'den List : " + arraydenList);

    }
}
