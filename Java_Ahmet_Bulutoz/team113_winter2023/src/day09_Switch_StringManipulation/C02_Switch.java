package day09_Switch_StringManipulation;

import java.util.Scanner;

public class C02_Switch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println( "Lütfen hangi mevsimde oldugunu ögrenmek istediginiz ayin numarasini tam sayi olarak giriniz ");
        int ayNo = scan.nextInt();
        scan.close();

        switch (ayNo) {
            case 12, 1, 2 -> System.out.println("Kis");
            case 3, 4, 5 -> System.out.println("Ilkbahar");
            case 6, 7, 8 -> System.out.println("Yaz");
            case 9, 10, 11 -> System.out.println("Sonbahar");
            default -> throw new IllegalStateException("Unexpected value: " + ayNo);
        }
    }
}
