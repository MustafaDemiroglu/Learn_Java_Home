package day19_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String> harfler = new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("K");
        System.out.println(harfler);   // [A, B, K]

        System.out.println(harfler.remove("B"));
        System.out.println(harfler);    // [A, K]

        System.out.println(harfler.remove(0));
        System.out.println(harfler);    // [K]

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(18);
        sayilar.add(2);


    }
}
