package day19_ArrayLists;

import day17_Arrays.C06_ArrayElemanEklemeMethodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {
        /*
         * ArrayList, uzunlugu esnek bir listedir
         * Array altyapisini kullanir ancak eklme ve silme gibi islemlerde daha avantajlidir
         *
         * tek dezavataji elementleri tek tek eklemeniz gerekmesi
         */

        int [] arr = {3,4};
        arr = C06_ArrayElemanEklemeMethodu.arrayeElementEkleMethodu(arr,5);
        System.out.println(Arrays.toString(arr));  // [3, 4, 5]

        arr = C06_ArrayElemanEklemeMethodu.arrayeElementEkleMethodu(arr,15);
        System.out.println(Arrays.toString(arr));   // [3, 4, 5, 15]

        List<String> harfler = new ArrayList<>();   // bos bir List olusturur

        System.out.println(harfler);    // []
        harfler.add("s");
        harfler.add("l");
        harfler.add("a");

        System.out.println(harfler);    // [s, l, a]

    }

}
