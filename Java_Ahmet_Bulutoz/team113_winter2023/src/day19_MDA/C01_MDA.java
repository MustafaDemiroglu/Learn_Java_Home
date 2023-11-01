package day19_MDA;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {

        // Soru 2 - verilen 2 katli bir array de ayni index e
        // sahip elementleri toplayip
        // yeni olusturacagimiz tek katli
        // bir array e bu toplamlari atayin
        // input :      int[][] arr ={{3,4,5},{2.3.6.7}}
        // output:      int[] arr2 ={5,7,11}

        int[][] arr ={{3,4,5},{2,3,6,7}};

        // ortak index kullanabilmek icin en kisa olani bulmaliyiz

        int enKisaArrayLength = arr[0].length;       //3

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length < enKisaArrayLength) {
                enKisaArrayLength = arr[i].length;
            }
        }

        // toplamlari koymak icin yeni bir array olusturalim

        int[] toplamlarArrayi = new int[enKisaArrayLength];
        int indekstekiElementlerToplami=0;

        for (int i = 0; i < toplamlarArrayi.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                indekstekiElementlerToplami += arr[j][i];
            }
            toplamlarArrayi[i]=indekstekiElementlerToplami;
            indekstekiElementlerToplami=0;
        }

        System.out.println(Arrays.toString(toplamlarArrayi));
    }

}
