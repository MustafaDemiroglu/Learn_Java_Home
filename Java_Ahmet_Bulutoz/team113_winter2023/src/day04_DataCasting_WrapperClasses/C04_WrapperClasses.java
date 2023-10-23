package day04_DataCasting_WrapperClasses;

public class C04_WrapperClasses {

    public static void main(String[] args) {

        /*
        // non-primitive Data türlerinin hazir metodlar varken
        // primitive data türlerinin hazir metodlari yoktur
        // Java primitive Data türleri icin kolayca gecis yapabilecekleri
        // non-primitive data türleri olusturmustur

        int ==> Integer
        char ==> Character
        byte ==> Byte
        boolean ==> Boolean
        */

        Integer sayi = 10;
        // int variable a atadigimiz degerleri atayabiliyoruz
        // arti olarak hazir metodlari var
        // variable olusturmadan da bazi metodlari kullanabiliyoruz

        System.out.println(Integer.MIN_VALUE); //  -2147483648
        System.out.println(Integer.MAX_VALUE); //   2147483647

        String sonucStr = "345" ;
        System.out.println(sonucStr + 10);  // 34510

        // bu degere 10 ekleyin

        // int sonuc = (int) sonucStr  // bu da bize maalesef istedigimiz sonucu vermeyecektir
        // Bu durumda Wrapper Classlar imdada yetisir

        int sonuc = Integer.parseInt(sonucStr);
        System.out.println(sonuc + 10);  // 355

        sonuc = Integer.valueOf(sonucStr);
        System.out.println(sonuc + 10);  // 355

        char krk = '3';
        System.out.println(Character.isDigit(krk));     // true
        System.out.println(Character.isLetter(krk));    // false

    }
}
