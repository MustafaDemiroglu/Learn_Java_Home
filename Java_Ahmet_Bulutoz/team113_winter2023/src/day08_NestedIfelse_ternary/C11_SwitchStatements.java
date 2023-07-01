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

        if (harf == 'P') {
            System.out.println("Pazar, Persembe veya Pazartesi olabilir");
        } else if (harf =='S') {
            System.out.println("Sali");
        } else if (harf == 'C') {
            System.out.println("Carsamba, Cuma ve Cumartesi");
        } else {
            System.out.println("Hatali giris yaptiniz lütfen tekrar deneyiniz");
        }

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
