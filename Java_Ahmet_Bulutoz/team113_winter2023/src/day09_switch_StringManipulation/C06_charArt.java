package day09_switch_StringManipulation;

public class C06_charArt {

    public static void main(String[] args) {

        String str = "Java Candir";
        System.out.println(str.charAt(0));          // J

        // bastan 6. harfi yazdirin
        System.out.println(str.charAt(5));          // C

        // sondan ikinci harfi yazdirin
        System.out.println(str.charAt(11-2));       // i

        // son harfi yazdirin
        System.out.println(str.charAt(11-1));       // r

        // System.out.println(str.charAt(11));      // StringIndexOutOfBoundsException

        System.out.println(str.charAt(15));         // StringIndexOutOfBoundsException

        /*
         * Java da iki türlü hata ile karsilasabiliriz
         * 1 - syntax olarak hatali yazilan kodlari Java compile ederken anlar ve altini kirmizi cizer
         * str =23 ; String bir variable int deger atanamayacagini bilir ve altini kirmizi cizer
         * Compile tiime error (CTE) diyoruz
         *
         * 2 - Bazen de syntax de hata ol,maz
         * Java sorunu calismaya basladiktan sonra farkeder
         * str.charArt(15): burada verilen str dan bir karakter isteniyor
         * compile time da str in uzunlugunu Java anlamaz
         * ama calisinca 15.Index in olmadigini farkeder ve exception firlatir
         * RunTimeError (RTE) deriz
         */
    }
}
