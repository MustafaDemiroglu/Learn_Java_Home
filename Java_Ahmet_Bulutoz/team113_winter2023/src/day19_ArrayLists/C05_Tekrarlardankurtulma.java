package day19_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Tekrarlardankurtulma {
    public static void main(String[] args) {

        // verilen bir array den tekrar eden sayilari silip
        // her bir elementin sadece bir kez kullanildigi bir hale dönüstürün

        int[] arr = {3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};

        // bir tabe bos list olsuturalim
        // array deki her bir elemani ele alalim
        // ele aldigimiz element list de yoksa ekleyelim, varsa eklemeyelim
        // boylece bnzersiz elementlerden olsusan bir list olusturalim.

        List<Integer> benzersizElementlerListesi = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (!benzersizElementlerListesi.contains(arr[i])) {
                benzersizElementlerListesi.add(arr[i]);
            }
        }
        System.out.println(benzersizElementlerListesi); // [3, 4, 5, 6, 2, 7]

        // istenen listeyi list olarak elde ettik
        // bunu array e direk olarak atayamayiz.

        arr = new int[benzersizElementlerListesi.size()];
        System.out.println(Arrays.toString(arr));   //  [0, 0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=benzersizElementlerListesi.get(i);
        }
        System.out.println(Arrays.toString(arr));   // [3, 4, 5, 6, 2, 7]


    }
}
