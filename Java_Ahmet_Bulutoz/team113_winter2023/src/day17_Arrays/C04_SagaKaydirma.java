package day17_Arrays;

import java.util.Arrays;

public class C04_SagaKaydirma {
    public static void main(String[] args) {
        // Veilen int bir array deki tüm elementleri bir saga kaydirip
        // sondaki elementi de en basa alip kaydedin
        // arn : 3,4,5,6   ==> son hali = 6,3,4,5

        int [] arr = {3,4,5,6};

        int temp = arr[arr.length-1];

        for (int i = 0; i <arr.length-1 ; i++) {
            arr[arr.length-1-i] = arr[arr.length-2-i];
        }

        arr[0] = temp;

        System.out.println(Arrays.toString(arr));
    }


}
