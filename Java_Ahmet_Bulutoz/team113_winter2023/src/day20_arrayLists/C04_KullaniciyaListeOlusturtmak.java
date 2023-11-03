package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListeOlusturtmak {
    public static void main(String[] args) {
        // Kullanicidan istedigi kadar isim alip
        // Q ya bastiginda girdigi isimleri bize liste olarak
        // döndürecek bir method olusturun
        System.out.println(kullaniciyaListOlusturtmaMethodu());

    }

    public static List<String> kullaniciyaListOlusturtmaMethodu() {
        List<String> isimler = new ArrayList<>();
        String girilenisim="";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Listeye eklemek istediginiz bir isim giriniz ");
            System.out.println("Cikmak icin / Bitirmek icin 'Q' ya basiniz");
            girilenisim = scan.nextLine();

            if (!girilenisim.equalsIgnoreCase("Q")) {
                isimler.add(girilenisim);
            }
        } while (!girilenisim.equalsIgnoreCase("Q"));

        return isimler;
    }
}
