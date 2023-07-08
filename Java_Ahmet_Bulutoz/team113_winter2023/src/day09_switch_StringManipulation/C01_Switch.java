package day09_switch_StringManipulation;

import java.util.Scanner;

public class C01_Switch {

    public static void main(String[] args) {

        // Soru 3 - Kullanicidan ay numarasini alip ay ismini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yazdirmak istediginiz ay numarasini tamsayi olarak  giriniz ");
        int ayNo = scan.nextInt();
        scan.close();

        switch (ayNo) {
            case 1 -> System.out.println("Ocak");
            case 2 -> System.out.println("Subat");
            case 3 -> System.out.println("Mart");
            case 4 -> System.out.println("Nisan");
            case 5 -> System.out.println("Mayis");
            case 6 -> System.out.println("Haziran");
            case 7 -> System.out.println("Temmuz");
            case 8 -> System.out.println("Agustos");
            case 9 -> System.out.println("Eylül");
            case 10 -> System.out.println("Ekim");
            case 11 -> System.out.println("Kasim");
            case 12 -> System.out.println("Aralik");
            default -> System.out.println("Ay numarasi yanlis girildi, Lütfen tekrar deneyiniz");
        }

    }
}
