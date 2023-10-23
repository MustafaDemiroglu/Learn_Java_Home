package day12_ForLoops;

import java.util.Scanner;

public class C04_Faktoryel {
    public static void main(String[] args) {
        // Sur 5 - Kullanicidan 20 den kücük bir sasi alip
        // bu sayinin faktöriyel degerini hesaplayiniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 20 den kücük bir tamsayi giriniz : ");
        int sayi = scan.nextInt();
        scan.close();

        System.out.println("---------Benim Cözümüm--------------");
        int fak = 1;

        for (int i = 1; i <=sayi ; i++) {
            fak = fak*i;
        }
        System.out.println("Grirdiginiz sayi : " + sayi +  " \nve faktöriyel degeri : " + fak );

        System.out.println("------------ Hocanin Cözümü -----------------------");

        int faktoriyel=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoriyel*=i;
            System.out.println(sayi+"! = " + faktoriyel);
        }
        System.out.println(sayi + "! = " + faktoriyel);

    }

}
