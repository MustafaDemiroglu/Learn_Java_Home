package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C04_ifStatements {
    public static void main(String[] args) {
        // Soru 5 - Kullanicidan notunu alin
        //          50 veya daha büyükse "Sinifi gectin"
        //          50'den kücükse "Mallesef kaldirin"

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen notunuzu giriniz");

        double not = scan.nextDouble();

        if (not>=50 &&  not<=100) {
            System.out.println("Sinifi gectin");
        }

        if (not<50) {
            System.out.println("Maalesef kaldin");
        }

    }


}
