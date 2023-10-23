package day18_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_BinarySearch {
    public static void main(String[] args) {
        // verilen bir array de istenen elemanin olup olmadigini bulur

        int[] arr = {4,9,1,5,11,3,7,4,6};

        System.out.println(Arrays.binarySearch(arr,5));
        System.out.println(Arrays.binarySearch(arr,11));
        System.out.println(Arrays.binarySearch(arr,1));
        System.out.println(Arrays.binarySearch(arr,7));

        // Array de binarySearch() duzgun calismadi icin
        // oncelile sort () calistirilmalidir

        Arrays.sort(arr);
        System.out.println("Ayni siralama Arrays.sort() yapildiktan sonra ayni  ");
        System.out.println(Arrays.binarySearch(arr,5));
        System.out.println(Arrays.binarySearch(arr,11));
        System.out.println(Arrays.binarySearch(arr,1));
        System.out.println(Arrays.binarySearch(arr,7));
        System.out.println(Arrays.binarySearch(arr,4));

        // binarySearch() aranan elementin index ini döner

        System.out.println("Arrray de olmayan degerler icin binarySearch() yapildiginda " +
                "\nayni deger bize 0 dikkate alindiginda sirasi olarak cikar");
        System.out.println(Arrays.binarySearch(arr,2));     //-2
        System.out.println(Arrays.binarySearch(arr,-3));    //-1
        System.out.println(Arrays.binarySearch(arr,8));     //-8
        System.out.println(Arrays.binarySearch(arr,10));    //-9
        System.out.println(Arrays.binarySearch(arr,13));    //-10
        System.out.println(Arrays.binarySearch(arr,20));    //-10

        // olmayan bir element aratilirsa, once array de olsaydi nerede olurdu bunu buluyoruz
        // olmasi gereken siranin - isaretli degerini veriyoruz
        // bu mantikla en kücük element den daha kücük butun sayilar icin -1
        // en büyük elementten büyük olan butun sayilar icin de length-1 degeri döndürür
    }

}
