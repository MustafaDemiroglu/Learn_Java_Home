package day11_StringManipulation_ForLoop;

public class C04_replaceAll {

    public static void main(String[] args) {

        String str = "J1a23va34 5C54an6d5ir87";
        System.out.println(str);
        // str daki sayilari metodla temizleyin

        /*
         * Eger degistirmek istedigimiz metin tek bir metin degil
         * or5ak özelligi olan farkli metinlerse
         *
         *  - tüm sayilar
         *  - sayi olmayanlarin tümü
         *  - tüm space ler
         *  - space olmayan tüm karakterler
         *
         *  bu ortak özellikler icin Java Regex (Regular Expressions) tanimlanmistir
         */

        str = str.replaceAll("\\d","");
        System.out.println("str nin yeni hali : " + str);


    }
}
