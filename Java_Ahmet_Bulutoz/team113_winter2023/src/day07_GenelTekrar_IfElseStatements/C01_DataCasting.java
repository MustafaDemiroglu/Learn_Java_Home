package day07_GenelTekrar_IfElseStatements;

public class C01_DataCasting {

    public static void main(String[] args) {

    // Java'da bazi Data türleri asla baska data türlerine cevrilemez

    /*
     * String str1 = false ;
     * String str2 = 20 ;
     * boolean bl1 = 'a';
     * int sayi1 = "Merhaba";
     */

    // özellikle de sayisal data türündeki degerler,
    // baska sayisal data türündeki variable a atanabilir

        double db1 = 23 ;
        short sh1 = 12 ;

        int sayi2= sh1;

        // daha dar data türündeki degeri daha genis data türündeki variable atamaya
        // autowidening denir ve Java bunu otomatik yapar

        sh1 = (short)sayi2;
        sayi2 = (int)db1;

        // daha genis dazta türündeki degeri, daha dar data türündeki variable a atamaya
        // explicit narrowing denir ve java bunu otomatik yapmaz
        // biztden onay ister

        sayi2 = 'k';

        if (sayi2>'d'){

        }

        // char data türündeki degerler sayisal islemlerde kullanilabilirler
        // bir char matematiksel islemde kullanilirsa ASCII table'daki degeri ile isleme girer

        System.out.println('k'+1);      // 108
        // eger bu islemin char olarak degerini yazdirmak istersek
        // sayisal degerler char a cast edilebilirler

        System.out.println((char)('k'+1));

        db1=398784564145954415445654d;
        int sayi3 = (int)db1;
        System.out.println("sayi3 : " + sayi3);
        short sh2 = (short)db1;
        System.out.println("sh2 : " + sh2);

    }
}