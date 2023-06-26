package day08_NestedIfelse_ternary;

import java.util.Scanner;

public class C04_Ternary {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alin
        // sayi cift ise sayi cift
        // degilse tek sayi yazdirin

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Lütfen pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt() ;

        System.out.println("-------- if else --------");

        if (sayi %2 ==0) {
            System.out.println("Cift sayi");
        } else {
            System.out.println("Tek sayi");
        }

        System.out.println("-------- Ternary -----------");
        System.out.println(sayi%2==0? "Cift sayi" : "Tek sayi") ;
    }
}
