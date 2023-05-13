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


        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir");

        // Kullanici istedigimiz data türünde bilgi girisi yapmazsa
        // kodumuzda hata olusur ve calisma durur
        // ilerde kulanici hatalarina karsi nasil tedbirler alacagimizi ogrenecegiz
        // Simdilik kullanici biz ne diyorsak onu tam yapiyor kabul edelim
    }
}
