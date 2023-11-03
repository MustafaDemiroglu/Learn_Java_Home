package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C10_ListElementlerininYeriniDegistirme {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(10);
        System.out.println("Önce : " + sayilar);    // [3, 5, 1, 4, 3, 7, 10]

        // 2. index teki element ile 5. index deki elemetin yerini degistirin

        // önce gecici elementler oluturalim ve degistirilmesi istenen degerleri atayalim
        int sayi1 = sayilar.get(2);
        int sayi2 = sayilar.get(5);

        // sonra kaydettigimiz degerleri istenen indexlere atayalim
        sayilar.set(2,sayi2);
        sayilar.set(5,sayi1);
        System.out.println("Sonra : " + sayilar);    // [3, 5, 7, 4, 3, 1, 10]




    }
}
