package day10_stringManipulation;

import java.util.Scanner;

public class C04_endsWith {

    public static void main(String[] args) {

        /*  SORU : Kullanicidan bir mail alin
         *  - mail @ icermiyorsa "gecersiz email"
         *  - mail @gmail icermiyorsa "gecersiz mail"
         *  - mail @gmail.com ile bitmiyorsa "mailde yazim hatasi var" yazdirin.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen email adrsinizi giriniz");
        String email = scan.nextLine();
        scan.close();

        if (!email.contains("@"))  {
            System.out.println("gecersiz email");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!email.endsWith("gmail.com")) {
            System.out.println("Mailde yazim hatasi var");
        } else {
            System.out.println("Mail adresi dogru");
        }
    }
}