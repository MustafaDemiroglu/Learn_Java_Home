package day11_stringManipulation_ForLoop;

public class C07_SifreKontrol {

    public static void main(String[] args) {

        /* Soru 4 : Kullanicidan bir sifre isteyip,
         * asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken
         * tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
         * ilk harf kucuk harf olmali -
         * son karakter rakam olmali -
         * sifre bosluk icermemeli -
         * uzunlugu en az 10 karakter olmali
         */

        // soruyu if else ile yaparsak sadece bir hata yazdirir ötekilere nakmaz
        // bagimsiz 4 adet if cümlesi olmali ki her biri hatayi tek tek kontrol edip söylesin
        // en sonda 4 sarti da sagladigini kontrol eden bir variable kullanacagiz

        int flag = 0 ;
        String sifre = "1abcde fsdfsdf123" ;

        // ilk harfin kücük harf oldugunu kontrol edelim
        if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z') {
            flag ++ ;
        } else {
            System.out.println("Sifrenizin ilk karakteri kücük harf olmali. Yanlis giris yaptiniz.");
        }

        // son karakterin rakam oldugunu kontrol edelim
        char sonHarf = sifre.charAt(sifre.length()-1);
        if (sonHarf>='0' && sonHarf<='9') {
            flag++ ;
        } else {
            System.out.println("Sifrenizin son karakteri rakam olmali");
        }

        // sifrenin bosluk icermedigini kontrol edelim
        if (sifre.contains(" ")) {
            System.out.println("Sifreniz kabul edilmeyen karakter iceriyor. Sifreniz bosluk icermemeli");
        } else {
            flag++;
        }

        // uzunlugu kontrol edelim
        if (sifre.length()>=10) {
            flag++;
        } else {
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmalidir");
        }

        // eger tüm satlari saglarsa
        if (flag == 4) {
            System.out.println("Sifreniz basariyla kaydedilmistir");
        } else {
            System.out.println("Hatali giris yaptiginiz icin sifreniz kaydedilememistir");
        }
   }
}
