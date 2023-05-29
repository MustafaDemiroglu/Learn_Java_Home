package day05_incrementDecrement_Concatenation;

public class C03_Concatenation {

    public static void main(String[] args) {

        // Bir String baska bir String veya baska bir data türünden bir bvariable ile
        // + isareti ile birlestirilebilir

        String a = "Java";
        String b = "Güzeldir";

        System.out.println(a+b);        // JavaGüzeldir
        System.out.println(a+" "+b);    // Java Güzeldir

        int c = 10 ;
        int d = 20 ;
        System.out.println(a+c+d);  // Java1020
        // Eger String ile baska data türündeki bir deger toplanirsa Java sonucu String yapar
        System.out.println(c+d+a);      // 30Java

        // Peki Java30 yazmak sitersek
        System.out.println(a+(c+d));    // Java30

        System.out.println(a+c*d);      // Java200


    }
}
