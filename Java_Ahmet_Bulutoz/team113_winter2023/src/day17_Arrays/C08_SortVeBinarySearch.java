package day17_Arrays;

import java.util.Arrays;

public class C08_SortVeBinarySearch {
    public static void main(String[] args) {
        // verilen bir arry i natural order a göre siralamak icin
        // arrays.sort methodu kullanilir

        int[] arr1 ={3,9,6,1,7};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String[] arr2 ={"Hasan", "Hüseyin", "Mehmet", "Mesut", "Mercan", "Ali"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // sort yaildiktan sonra
        // array de bir elemanin oldugunu kontrol etmek icin

        System.out.println(Arrays.binarySearch(arr2, "Ali"));

    }
}
