package day07_GenelTekrar_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseIf {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alin
        // sayi 3 ile bölünebiliyorsa "3ün kati"
        // sayi 5 ile bölünebiliyorsa "5"in kati
        // sayi hem 3 hem de 5 ile bölünebiliyorsa "3" ve "5" in kati
        // ikisine de bölünemiyorsa "ne 3 ün ne de 5 in kati2 yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayi giriniz : ");

        int sayi = scan.nextInt();


        if (sayi %3 == 0 && sayi %5 == 0 ) {
            System.out.println("hem 3 ün hem de 5 in kati");
        } else if (sayi %3 == 0) {
            System.out.println("3 ün kati");
        } else if (sayi %5 == 0 ) {
            System.out.println("5 in kati");
        } else {
            System.out.println("ne 3 ne de 5 in kati");
        }

    }
}
