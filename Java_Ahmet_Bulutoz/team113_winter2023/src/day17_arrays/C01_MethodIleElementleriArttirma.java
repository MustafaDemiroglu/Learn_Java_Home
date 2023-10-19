package day17_arrays;

import java.util.Arrays;

public class C01_MethodIleElementleriArttirma {
    public static void main(String[] args) {
        // Soru- 1 : Verilen bir int arrayin tüm elemanlarini 2 arttirip
        // bize döndüren bir method olusturun.
        // Eski array i yeni haliyle kaydedin

        int[] arr = {3,4,5,6};

        arrayElementleriniArttir(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] arrayElementleriniArttir(int[] ilkArr, int artisMiktari) {
        for (int i = 0; i <ilkArr.length ; i++) {
            ilkArr[i]+=artisMiktari;
        }
        return ilkArr;
    }
}
