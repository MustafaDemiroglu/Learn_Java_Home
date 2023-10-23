package day17_Arrays;

import java.util.Arrays;

public class C05_ArraeElemanEkleme {
    public static void main(String[] args) {
        // Verilen array a istenen elementi ekleyelim

        int [] a = {1,2,3};
        int [] b = {3,4,5,6,7};

        a = b;

        System.out.println(Arrays.toString(a));

        /*
         * Array in uzunlugu degistirilmez
         * Ancak array e yeni bir array degeri atanabilir
         */

        int [] arr = {4,5,6};
        int eklenecekElement = 10;

        // arr = new int [4];  // [0,0,0,0]
        // direk atama yaparsak eski degerler kaybolur
        // önce istenen uzunlukta yeni bir array olusturup
        // eski array deki tüm elementleri yeni array e tasiyoruz
        // sonra istenen elementide atayip
        // yeni istedigimiz hale gelince
        // eskiArr = yeniArr; diyerek yeni array in degerini eskisine atiyoruz

        int [] yeniArr = new int [arr.length+1];    // [0,0,0,0]

        for (int i = 0; i < arr.length ; i++) {
            yeniArr[i] =arr[i];
        } // yeniArr[] = 4,5,6,0

        yeniArr[yeniArr.length-1] = eklenecekElement; //
        arr = yeniArr ;

        System.out.println("Ekleme yapildiktan sontraki array");
        System.out.println(Arrays.toString(arr));

    }
}
