package day16_Scope_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String[] isimler = {"Nuerfsan", "Berke" , "Mustafa"};
        int[] sayilar = {3,4,5,6,7,8,9,10,33,66,6,6,3,3};
        char karakterler[] = {'e', '4', ','};

        // Array non-primitive data türlerindendir
        // Eger array i liste seklinde olusturmayip
        // new keyword kullaniyorsak uzunlugunu yazmak zorundayiz

        String[] arr = new String[5];

        // Bir array tanimlanan uzunluktan daha fazla veya az eleman alamaz
        System.out.println(isimler);
        // array laer dorek yazdirilamaz

        Arrays.toString(isimler);
        System.out.println(Arrays.toString(sayilar));

        System.out.println(Arrays.toString(arr)); // null,.....

        int[] a = new int[7];

        System.out.println(Arrays.toString(a)); // 0,0,0,0,0,0,0

        // array deki elemanlara nasil ulasiriz
        // index ile

        a[0] = 4;
        a[3] = 7;
        // a[7] = 8;    // ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7


        System.out.println(Arrays.toString(a));




    }
}
