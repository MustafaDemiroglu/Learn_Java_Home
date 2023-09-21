package day14_MethodOverloading_WhileLoop;

public class C04_MethodOverloading {
    public static void main(String[] args) {

        /*
         * Java Overloading Kurallari:
         * 1- isim ve parametreleri ayni olan birden fazla method olusturulamaz
         * 2- Data türleri farkli olan parametrelerinin yerlerinin degistirirsek
         *    java yeni bir method olarak kabul eder(int, double yerine double,int a izin verir)
         *
         * Overloading olan Class larda
         * Java hangi method un calistirilacagina si sekilde karar verir
         *
         * 1- cagrilan isimde method var mi?
         * 2- method call´da kullanilan arguments yani parantez icine yazilanlar ile
         *    methodlardaki parametrelerin %100 uyumlu olmalarini kontrol eder
         * 3- argument ile parametre ayni olmasa bile
         *    verilen argumentleri kabul edecek parametre var mi?
         */

        topla(3,5); //8
        topla(3.4,2.3); // 5.7

        // topla("ali","veli");     // CTE bu argumentleri kabul edebilecek parametre yok

        topla('a','b');       // iki int 195
                                    // char parametreli bir method olmamasina ragmen ,
                                    // ASCII tablosundaki char degerlerine karsilik gelen (casting)
                                    // int degerler ile islem yapilir

        topla(3f,4f);         // 7.0
                                    // float degerlerini double kabul ederek islem yapar (casting)

        topla(3f,4);                // 7.0
                                    // float degerini double kabul ederek islem yapar (casting)

    }

    public static void topla(int a, int b){
        System.out.println("iki tam sayinin toplami : " + (a+b));
    }

    public static void topla(double a, double b) {
        System.out.println("iki double sayinin toplami : " + (a+b));
    }

    public static void topla (int sayi1, double sayi2) {
        System.out.println("int ve double sayinin toplami : " + (sayi1+sayi2));
    }

    public static void topla (double sayi1, int sayi2) {
        System.out.println("double ve int sayinin toplami : " + (sayi1+sayi2));
    }

}
