package day14_MethodOverloading_WhileLoop;

public class C04_MethodOverloading {
    public static void main(String[] args) {

        /*
         * Java Overloading Kurallari:
         * 1-isim ve parametreleri ayni olan birden fazla method olusturulamaz
         * 2- Data türleri farkli olan parametrelerinin yerlerinin degistirirsek
         *    java yeni bir method olarak kabul eder(int, double yerine double,int a izin verir)
         */

        topla(3,5); //8
        topla(3.4,2.3); // 5.7

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
