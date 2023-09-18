package day13_MethodOlusturma;

public class C05_StringiTerseCevirme {
    public static void main(String[] args) {
        // verilen bir String i tersine cevirip
        // bize donduren bir metghod olusturun

        System.out.println(stringTersineCevirmek("Java Candir"));
        System.out.println(stringTersineCevirmek("Anlasildi mi?"));
        System.out.println(stringTersineCevirmek("Soyle Omer"));

    }

    public static String stringTersineCevirmek (String metin) {
        String tersMetin = "";
        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin +=metin.charAt(i);
        }
        return tersMetin;
    }
}
