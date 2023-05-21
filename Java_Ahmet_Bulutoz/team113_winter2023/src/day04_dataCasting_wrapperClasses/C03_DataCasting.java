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

        

    }
}
