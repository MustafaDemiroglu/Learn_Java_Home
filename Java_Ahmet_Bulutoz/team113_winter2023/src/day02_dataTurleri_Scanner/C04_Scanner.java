package day02_dataTurleri_Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // 1. adim: Scanner objesi olusturun
        Scanner scan=new Scanner(System.in);

        // 2.adim kullaniciya ne istediginizi söyleyin
        System.out.println("Lütfen isminizi giriniz?");

        //3.adim girilen bilgiyi icine koyabileceginiz bir variable

        String kullaniciIsmi = scan.next();

        System.out.println("Girilen Isim: " + kullaniciIsmi );







    }
}
