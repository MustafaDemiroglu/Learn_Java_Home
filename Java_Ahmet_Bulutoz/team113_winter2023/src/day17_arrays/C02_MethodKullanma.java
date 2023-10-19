package day17_arrays;

import java.util.Arrays;

public class C02_MethodKullanma {
    public static void main(String[] args) {
        // asagidaki arrayin tüm elementleri  verilen int kadar arttirip
        // yeni halini kaydedin

        int artisMiktari = 5;
        int[] arr = {6,7,8};

        arr = C01_MethodIleElementleriArttirma.arrayElementleriniArttir(arr,artisMiktari);
        System.out.println(Arrays.toString(arr));

        System.out.println("------- Method Kullanmadan eski haline getirme -------- ");
        artisMiktari = -5;
        for (int i = 0; i < arr.length ; i++) {
            arr[i]+=artisMiktari;
        }
        System.out.println(Arrays.toString(arr));





    }
}
