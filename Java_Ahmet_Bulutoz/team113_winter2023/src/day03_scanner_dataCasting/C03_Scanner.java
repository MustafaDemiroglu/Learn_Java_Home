// Soru -6 Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin

package day03_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cemberin yaricapini giriniz : ");

        // Kullanicinin girdigi bilgiyi kaydedebilecek data türünde bir variable olusturun
        // kullanicidan bilgiyi almak icin scan objesini ve ilgili next methodunu kullanin
        double yaricap = scan.nextDouble();

        // cevresini ve alanini yazdirin
        System.out.println("Cemberin cevresi : " + 2*3.14*yaricap);
        System.out.println("Dairenin alani : " + 3.14*yaricap*yaricap);
    }
}
