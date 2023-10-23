package day07_GenelTekrar_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseIf {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alin
        // sayi 3 ile bölünebiliyorsa "3ün kati"
        // sayi 5 ile bölünebiliyorsa "5"in kati
        // sayi hem 3 hem de 5 ile bölünebiliyorsa "3" ve "5" in kati

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Lütfen pozitif bir tamsayi giriniz : ");

        int sayi = scan.nextInt();

        if (sayi %3 == 0 && sayi %5 ==0 ) {
            System.out.println("3 ve 5 in kati ");
        } else if (sayi %3==0) {
            System.out.println("3 in kati ");
        } else if (sayi %5==0) {
            System.out.println("5 ün kati ");
        }

        /*
         * Bazen sartlar olasi tüm durumlari karsilamaz
         * bu durumda if else if ....... cümleleri else ile bitmez
         *
         * Eger bir if else if .... cümlesi else ile bitiyorsa
         * mutlaka if bodylerinden bir tanesi calisir
         */
    }
}
