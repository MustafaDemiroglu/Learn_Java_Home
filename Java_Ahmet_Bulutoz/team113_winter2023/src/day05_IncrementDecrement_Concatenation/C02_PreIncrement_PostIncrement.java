package day05_IncrementDecrement_Concatenation;

public class C02_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        /*
         * Eger sayinin degeri SADECE 1 artacak veya azalacaksa
         * arttirip sonra yazdirma / atama
         * yazdirip sonra arttirma / atama
         * islemlerini tek satirda yapabiliriz
         *

         */



        // a nin degerini 1 arttirin ve yeni degerini olusturacagniz b variable ina atayin

        int a = 20 ;
        int b= ++a;     // önce arttirir sonra b ye atama yapar
        System.out.println("a: " + a + " b: " + b);

        /*
        a++;
        int b=a;
        System.out.println("a: " + a + " b: " + b);
         */

        // a nin degerini b ye atayin sonra a nin degerini 1 arttirin

        a = 20 ;
        b=a++;      // önce atama yapar sonra arttirir
        System.out.println("a: " + a + " b: " + b);

        /*
        b=a;
        a++;
        System.out.println("a: " + a + " b: " + b);

         */

        System.out.println("a: " + a + " b: " + b);


        // Bu islemleri istersek tek satirda da yapabiiriz

        // a nin degerini yazdirin ve sonra ayi 1 artirin

        a=20 ;
        System.out.println("a : " + a);      // a:20
        a++;
        System.out.println("-------------------");

        a=20;
        System.out.println("a : " + a++);       // a:20
        System.out.println("Bir sonraki satirda a : " + a);
        System.out.println("-------------------");

        //  // a nin degerini 1 azaltin ve sonra a nin degerini yazdirin
        a=20;
        System.out.println(--a);
        System.out.println("Bir sonraki satirda a: " + a);





    }
}
