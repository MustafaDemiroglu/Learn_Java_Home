package day11_stringManipulation_ForLoop;

public class C02_nullPointer {

    public static void main(String[] args) {

        // null bir deger degildir
        // null bir pointer' dir,
        // yanina yazildigi non-primitive Variable'a deger atanmadigini isaret eder.

        String str; //str olusturuldu ama deger atanmadi

        // Java method icerisinde deger atamadan variable olusuturlmasina izin verir
        // ama deer atamadan kullanilmasina izin vermez

        // System.out.println(str); CTE

        // str.concat("Java"); CTE

        // Bazen programlarda variable lar olusturulur ama daha sonra degre atanacagi icin
        // deger atamasi yapilmaz
        // deger atamasi yapilmadan listeleme ile olmadigi icin
        // deger verilmedigini isaretleyecek, ama CTE olusmasini engelleyecek
        // bir cözüm olarak null pointer olusturulmustur

        str = null;     // str = "null" degil
                        // null yani bos olarak isaretlenmistir
                        // degeri null atanmis degildir

        System.out.println(str);        // null
        // System.out.println(str.concat("Java")); // Run time Error    --- NullPointerException
        // System.out.println(str.length());       // Run time Error    --- NullPointerException
        System.out.println(str+"Java");

        String str2 = str + "Java" ;

        System.out.println("str2 : " + str2);

        // int sayi = null ;  primitive variable'lara  null degeri olmaz
        Integer sayi = null;

        // biz genelde String bir ifade olusturup, sonra deger atayacaksak
        // hiclik degeri atariz


        System.out.println("-------------");
        String str3 = ""; // str3 e deger atanmistir
                            // atanan deger hicliktir

        System.out.println(str3);
        System.out.println(str3.isEmpty());
        System.out.println(str2.isEmpty());
        // System.out.println(str.isEmpty());  // Run time Error    --- NullPointerException

        System.out.println(str3.length());

    }
}
