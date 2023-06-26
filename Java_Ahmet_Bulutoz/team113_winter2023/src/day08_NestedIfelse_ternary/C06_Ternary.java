package day08_NestedIfelse_ternary;

public class C06_Ternary {

    public static void main(String[] args) {

        // ternary operatoru ya direk sout icerisinde kullanilir
        // veya bir degiskene atama yapilacak sekilde yazilir

        int sayi = 20 ;

        // sayi%2==0 ? "sayi cift" : "sayi tek" ;    bu sekilde yazilirsa java hata verir

        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek" );
        String sonuc = sayi%2==0 ? "sayi cift" : "sayi tek";

        // eger true oldugundaki sonuc ile false oldugundaki sonuc
        // farkli data türlerinde olursa

        // sayi cift ise "sayi cift" yazdirin
        // degilse sayinin 2 katini yazdirin

        System.out.println(sayi%2==0? "cift sayi":2*sayi);


        // String sonuc2 = sayi%2==0? "cift sayi":2*sayi;
        // int sonuc3 = sayi%2==0? "cift sayi":2*sayi;

        // eger atama yapilacaksa uygun data türündeki giris yapilmaz ise java hata verecektir

    }
}
