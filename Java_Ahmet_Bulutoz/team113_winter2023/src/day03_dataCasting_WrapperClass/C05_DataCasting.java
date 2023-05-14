package day03_dataCasting_WrapperClass;

public class C05_DataCasting {

    public static void main(String[] args) {
        /*
         *Bazi primitive data türleri baska hiv bir data türünden deger kabul etmez
         */

        boolean bl = false ;

        bl = true ;

        // bl = "true" ;
        // bl = 20 ;
        // bl = 'a';

        char ch = 't';
        ch = '%';
        ch = ' ';
        ch = 99;

        int sayi1=20;
        short sayi2 = 15;
        double sayi3= 24;

        sayi1 = sayi2 ;
        // sayi1= sayi3;
        // sayi2 = sayi1 ;
        // sayi2 = sayi3 ;
        sayi3= sayi1;
        sayi3=sayi2;

        sayi1 = ch;
        // sayi2 = ch;
        sayi3= ch;

    }
}
