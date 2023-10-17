package day16_Scope_Arrays;

import java.util.Arrays;

public class C03_ArrayElementleriniYazdirma {

    public static void main(String[] args) {

        int [] arr = {3,4,5,6,7,8,1,2};

        // tüm array i yazdirin

        System.out.println(Arrays.toString(arr));   // [3,4,5,6,7,8,1,2]

        // Array in tüm elementlerini yanyana bir bosluk olacak sekilde yazdirin

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
