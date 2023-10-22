package day17_arrays;

import java.util.Arrays;

public class C06_ArrayElemanEklemeMethodu {
    public static void main(String[] args) {
        // verilen bir array e istenen bir elementi ekleyip
        // yeni halini bize geri döndüren bir method olusturun
        int [] arr = {2,4,7,8};

        // arr e method kullanarak 5 ekleyin
        arr = arrayeElementEkleMethodu(arr,5);
        arr = arrayeElementEkleMethodu(arr,3);
        arr = arrayeElementEkleMethodu(arr, 19);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayeElementEkleMethodu(int [] arr, int eklenecekEleman) {
        int[] yeniArr = new int[arr.length+1]; // [0,0,0,0,0]

        System.arraycopy(arr, 0, yeniArr, 0, arr.length);
        // yeniArr [2,4,7,8,0]
        yeniArr[yeniArr.length-1] = eklenecekEleman;

        return yeniArr;
    }
}
