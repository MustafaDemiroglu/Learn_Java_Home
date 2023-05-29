package day05_incrementDecrement_Concatenation;

public class C04_StringIntGecisler {

    public static void main(String[] args) {

        String s1 = "423" ;

        // s1 integer cevirmek istersek

        int sayi = Integer.parseInt(s1) ;

        System.out.println(sayi);     // 423

        int a  = 20 ;
        int b = 40 ;

        // bu iki sayiyi kullanarak 2040 yazdirin

        System.out.println(a+""+b);     // 2040
        System.out.println(""+a+b);     // 2040

        System.out.println(a+" "+b);    // 20 40

        a = 10 ;
        b = 15 ;

        System.out.println( a == b );
        System.out.println( a == b-5 );
        boolean c ;

        System.out.println( c = 15 ==b );



    }
}
