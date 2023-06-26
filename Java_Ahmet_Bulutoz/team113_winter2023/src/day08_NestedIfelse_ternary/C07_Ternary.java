package day08_NestedIfelse_ternary;

import java.util.Scanner;

public class C07_Ternary {

    public static void main(String[] args) {

        // Soru-2 : Kullanicidan bir ücgenin 3 kenar uzunlugunu alin
        // ucgen eskenar ise "Eskenar ücgen" yazdirin
        // degilse "Eskenar degil" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("1. kenar uzunlugunu giriniz : ");
        int kenar1 = scan.nextInt();
        System.out.println("2. kenar uzunlugunu giriniz : ");
        int kenar2 = scan.nextInt();
        System.out.println("3. kenar uzunlugunu giriniz : ");
        int kenar3 = scan.nextInt();

        System.out.println(kenar1==kenar2 && kenar1==kenar3 && kenar1>0 ? "eskenar ücgen":"eskenar degil");

    }
}
