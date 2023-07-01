package day08_NestedIfelse_ternary;

import java.util.Scanner;

public class C11_SwitchStatements {

    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin
        // O harf ile baslayan gün ismi var ise yazdirin
        // yoksa "gecersiz harf yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz : ");
        char harf = scan.next().charAt(0);
        scan.close();

        harf = Character.toUpperCase(harf);

        if (harf == 'P') {
            System.out.println("Pazar, Persembe veya Pazartesi olabilir");
        } else if (harf =='S') {
            System.out.println("Sali");
        } else if (harf == 'C') {
            System.out.println("Carsamba, Cuma ve Cumartesi");
        } else {
            System.out.println("Hatali giris yaptiniz lütfen tekrar deneyiniz");
        }

        System.out.println("----------------- Switch -----------------------");

        // daha düzenli ve kullnisli olarak swicth statement kulanabiliriz
        // switch statement switch in onunde yazilan deguiskene esit olan case calistirir
        // calismaya basladiktan sonra
        // break görünceye kadar veya switch in sonuna kadar calisir

        switch (harf) {
            case 'P':
                System.out.println("Pazar, Persembe veya Pazartesi olabilir");
                break;
            case 'S':
                System.out.println("Sali");
                break;
            case 'C':
                System.out.println("Carsamba, Cuma ve Cumartesi");
                break;
            default:
                System.out.println("Hatali giris yaptiniz lütfen tekrar deneyiniz");
        }

    }
}
