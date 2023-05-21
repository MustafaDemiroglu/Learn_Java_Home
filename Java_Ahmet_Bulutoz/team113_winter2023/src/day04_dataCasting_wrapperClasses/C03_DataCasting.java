package day04_dataCasting_wrapperClasses;

public class C03_DataCasting {

    public static void main(String[] args) {

        int a = 20 ;
        int b = 6 ;

        System.out.println(a/b); //3

        // Java bölünen iki sayi tamsayi ise sonucun  tamsayi kismini verir

        double c = 6 ;
        System.out.println(a/c);   // 20/6=3,33333333333333333333333335
        // int/double ===> double

        // bölünen sayilarin data türleri farkli ise sonucu daha genis olan cinsinden verir

        float d = 6f ;

        System.out.println(a/d);   // 20/6 = 3,333333

        // a/b isleinin sonucunu nasil ondalkli olarak yazdiracagiz

        System.out.println((double)(a/b));
        // islem önceligi parantez icinde (a/b) dedir
        // Java öncelikle (a/b) islemini yapar ve sonucu 3 bulur
        // sonra double oldugundan 3 ü double cast eder ve sonuc 3.0 bulr



    }
}
