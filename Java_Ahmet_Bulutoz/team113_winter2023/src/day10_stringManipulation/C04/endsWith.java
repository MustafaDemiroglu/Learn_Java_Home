package day10_stringManipulation.C04;

import java.util.Scanner;

public class endsWith {

    public static void main(String[] args) {

        /* SORU : Kullnicidan bir mail alin
         * mail @ icermiyorsa "gecersiz email
         *
         *
         *
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
