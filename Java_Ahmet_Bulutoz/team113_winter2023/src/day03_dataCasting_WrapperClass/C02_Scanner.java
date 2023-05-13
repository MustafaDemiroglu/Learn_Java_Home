/* Soru 5 - Kullanicidan ismini, soysimini ve yasini alip asagidaki formatta yazdirin
 * girilen bilgiler : J Doe, 44
 */

package day03_dataCasting_WrapperClass;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        // Isterseniz tek bir aciklama ile 3 bilgiyi de alabilirsiniz

        System.out.println("Lütfen isminizi, soyisminizi ve yasinizi giriniz" +
                "\nLütfen her bilgiden sonra ENTER'a basiniz  ");

        char isimIlkHarf = scan.nextLine().charAt(0);

        /*
            Scanner methodlarinda nextChar() yok
            bunun icin önce kullanicinin girisine göre next() veya nextLine() yazip
            sonra .charart(0) yazariz
            parantez icindeki 0 almak tsedigimiz char'in index'idir
            ve java'da index 0'dan baslar
         */

        String soyisim = scan.nextLine();
        double yas = scan.nextDouble();

        // girilen bilgilerin ekrana cikti olarak verilmesi

        System.out.println("Girilen Bilgiler : " + isimIlkHarf + " "+  soyisim +", " + Ahmet yas);

    }
}
