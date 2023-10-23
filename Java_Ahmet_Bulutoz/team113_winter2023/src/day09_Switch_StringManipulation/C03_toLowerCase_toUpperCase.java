package day09_Switch_StringManipulation;

import java.util.Locale;

public class C03_toLowerCase_toUpperCase {

    public static void main(String[] args) {

        String str = "Java Candir";

        // str buyuk harf yazdirin

        System.out.println(str.toUpperCase());  // JAVA CANDIR

        System.out.println(str);        // Java Candir

        // String manipulaton yaptiktan sonra, ail variable atama yapilmazsa
        // asil variable degismez

        str = str.toUpperCase();
        System.out.println(str);        // JAVA CANDIR
        System.out.println(str.toLowerCase());      // java candir

        // str türkce karakterleri gözönünde bulundurarak kücük harfe cevirin

        str = str.toLowerCase(Locale.forLanguageTag("TR"));
        System.out.println(str);    // java candir
    }
}
