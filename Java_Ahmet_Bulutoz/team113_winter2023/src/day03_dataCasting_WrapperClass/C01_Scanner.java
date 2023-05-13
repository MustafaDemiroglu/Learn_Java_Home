/* Soru 3 Kullnicinin ismini, soyismini ve yasini alip asagidaki formatta yazdirin
    Isminiz : John
    Soyisminiz : Doe
    Yasiniz : 44
    Kaydiniz basariyla tamamlanmistir
*/

package day03_dataCasting_WrapperClass;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        // Yardimci metod olusturulmasi
        Scanner scan = new Scanner(System.in);

        // Kullanicidan verilerin alinmasi
        // Ayni zamandan verilerin deklare edilmesi, uygun veri siniflarina göre belirlenmesi
        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lütfen soyadinizi giriniz");
        String soyisim = scan.nextLine();
        System.out.println("Lütfen yasinizi giriniz");
        double yas = scan.nextDouble();

        // Verilerin cikti olarak ekrana gosterilmesi

        /* 1. Yol: tüm ciktilar alt alta ekrana yansiyacan sekilde yazmak icin println kullanilir
        println de ki ln line yani hat satir olarak anlasilmalidir
        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir");

        System.out.println() deki ln yazdirma islemini yaptiktan sonta alt satira gecmesini
        saglar. println yerine print yazarsak yazdirdigimiz seyler yanyana yazdirilir
        */

        /* Asagidaki versiyonda ise println yerine print yazabiliriz. Ancak bu sekilde veriler ekranda
         yanyana yansir.
        System.out.print("Isminiz : " + isim);
        System.out.print(" Soyisminiz : " + soyisim);
        System.out.print(" Yasiniz : " + yas);
        System.out.print(" Kaydiniz basariyla tamamlanmistir");
        */

        /* Asagidaki varyans ta da istenildigi gibi ciktilar ekranda alt altta gorünmeyecektir.
        System.out.println(" Isminiz : " + isim +
                            "Soyisminiz : " + soyisim +
                            "Yasiniz : " + yas +
                            "Kaydiniz basariyla tamamlanmistir");
        */

        System.out.println(" Isminiz : " + isim +
                "Soyisminiz : " + soyisim +
                "Yasiniz : " + yas +
                "Kaydiniz basariyla tamamlanmistir");


        // Kullanici istedigimiz data türünde bilgi girisi yapmazsa
        // kodumuzda hata olusur ve calisma durur
        // ilerde kulanici hatalarina karsi nasil tedbirler alacagimizi ogrenecegiz
        // Simdilik kullanici biz ne diyorsak onu tam yapiyor kabul edelim
    }
}
