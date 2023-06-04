package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C03_ifStatements {

    public static void main(String[] args) {

        // Soru 5 - Kullanicidan bir ücgenin 3 kenar uzunlugunu isteyiniz
        //          eger bu ücgen eskenar ücgen ise ekrana "eskenar ücgen" yazdirin

        Scanner scan = new Scanner (System.in);

        System.out.println(" Ücgenin üc kenar uzunlugunu giriniz");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        /*
         * Java da 3 lü karsilstirma olmadigindan
         * ikili karsilastirma yapip && ile birlestirecegiz
         */

        if(kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("Eskenar ücgen");
        }




    }
}
