package day10_StringManipulation;

public class C01_substring {

    public static void main(String[] args) {

        String str = "Java ne kadar güzel";

        // substring iki farkli sekilde kullanilabilir
        // 1- tek parca parametre olursa , o index den baslar sonuna kadar yazdirir

        System.out.println(str.substring(8));       // kadar güzel

        // System.out.println(str.substring(0));       // Java ne kadar güzel

        System.out.println(str);

        System.out.println(str.substring(str.length()-3));      // zel

        System.out.println(str.substring(str.length()));        // hiclik

        // System.out.println(str.substring(str.charAt(str.length())));
        // error
        // StringIndexOutOfBoundsException:
        // Index 19 out of bounds for length 19
        // str in uzunlugu 19 son harfin index i 18
        // 19. index te karakter yok


        // 2 - iki parametre girilirse baslangic index in den (dahil) baslar
        // bitis index ine (haric) kadar olan bölümü yazdirir.

        System.out.println(str.substring(5,7));         // ne

        System.out.println(str.substring(3,4));         // a
        System.out.println(str.charAt(3));              // a


        System.out.println(str.substring(0,1));         // J
        System.out.println(str.charAt(0));              // J

    }
}
