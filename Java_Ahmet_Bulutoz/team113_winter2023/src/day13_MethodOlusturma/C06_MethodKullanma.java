package day13_MethodOlusturma;

import java.util.Scanner;

public class C06_MethodKullanma {
    public static void main(String[] args) {
        // Verilen bir String Polindrome olup olmadigini yazdirin
        // Polindrome : duzden ve tersten ayni sekilde yazilan
        // madam , 12321 , kabak

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Lütfen bir metin giriniz ");
        String metin = scan.nextLine();
        // String tersMetin = C05_StringiTerseCevirme.stringTersineCevirmek(metin);

        if (metin.equals(C05_StringiTerseCevirme.stringTersineCevirmek(metin))) {
            System.out.println(" bu kelime bir Polindrome");
        } else {
            System.out.println(" Bu kelime polindrome degil normL BIR KELIME");
        }
    }
}
