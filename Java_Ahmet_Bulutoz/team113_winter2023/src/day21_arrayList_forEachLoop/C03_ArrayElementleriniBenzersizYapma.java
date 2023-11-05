package day21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayElementleriniBenzersizYapma {
    public static void main(String[] args) {
        // Verilen bir array de tekrar eden elementler icin
        // mükerrer olanlari silip, tüm elemanlardan sadece 1 tane yapip
        // eski array a yeni halini atayip yazdirin

        int[] arr ={3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

        List<Integer> benzersizElementListesi = new ArrayList<>();
        // array deki herbir elementi tek tek kontrol edelim
        // List de yoksa ekleyelim, varsa eklemeyelim

        for (int each:arr) {
            if (!benzersizElementListesi.contains(each)) {
                benzersizElementListesi.add(each);
            }
        }
        System.out.println(benzersizElementListesi);
        arr = new int[benzersizElementListesi.size()];

        System.out.println(Arrays.toString(arr));   // [0, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=benzersizElementListesi.get(i);
        }
        System.out.println(Arrays.toString(arr));

    }
}
