package day10_stringManipulation;

import java.util.Scanner;

public class C04_endsWith {

    public static void main(String[] args) {

        /* SORU: Kullanicidan bir e-mail adresi alin
         * - girilen mail adresi @ icermiyorsa "gecersiz bir e-mail adresi girdiniz"
         * - girilen mail adresi @gmail icermiyorsa "gecersiz bir e-mail adresi girdiniz "
         * - girilen mail adresi @gmail.com ile bitmiyorsa "girdiginiz mailde yazim hatasi var" yazdirin.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen email adrsinizi giriniz");
        String email = scan.nextLine();
        scan.close();

        if (!email.contains("@"))  {
            System.out.println("Gecersiz bir Email adresi girdiniz");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("Girdiginiz Mail adresi Gmail bir adres olmali");
        } else if (!email.endsWith("gmail.com")) {
            System.out.println("Mailde yazim hatasi yapmis olmalisiniz, bu adres gecerli degil");
        } else {
            System.out.println("girdiginiz Mail adresi dogru");
        }
    }
}
