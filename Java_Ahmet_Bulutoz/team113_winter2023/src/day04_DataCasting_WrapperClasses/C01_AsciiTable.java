package day04_DataCasting_WrapperClasses;

public class C01_AsciiTable {

    public static void main(String[] args) {

        /*
         * 24 ==> 11000
         * a ==> 97 ==> 10100010
         * b ==> 98
         * ahmet icin ise her bir karakter ayri ayri makine diline cevrilir
         * char data türündeki variable ve degerler
         * sayisal data türlerine atanirsa veya
         * sayisal data türündeki datalarla isleme sokulursa
         * ASCII tabledaki degerleri ile isleme girer
         */

        System.out.println(5+'a');   // 102 sonucunu verir

        char ilkharf = 101;
        System.out.println(ilkharf);

        // kullanicinin verdigi harften bir sonraki harfi yazdirin

        char girilenchar = 'f' ;
        System.out.println(girilenchar+1); // 102+1=103

        // bin 103 degil 103 ün karsiligi olan char ifadeyi
        // yazdirmak istersek explicit casting yapmamiz lazim

        System.out.println("Girilen harften sonra gelen harf : " + (char)(girilenchar+1));

        // verilen harften iki öncekini yazdirmak
        girilenchar = 'M' ;
        System.out.println(girilenchar-2);  // 77-2 = 75
        System.out.println("Girilen harften iki önce gelen harf : " + (char)(girilenchar-2)); // K
    }
}
