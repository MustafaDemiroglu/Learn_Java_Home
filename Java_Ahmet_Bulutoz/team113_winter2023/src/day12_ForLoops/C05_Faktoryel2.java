package day12_ForLoops;

import java.util.Scanner;

public class C05_Faktoryel2 {
    public static void main(String[] args) {
        // Soru 6 - Kullanicidan 20 den kücük bir sayi alip
        // bu saayinin faktorye degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin. Ornegin : 6! = 6*5*4*3*2*1 = 720


        Scanner scan = new Scanner(System.in);
        System.out.println(" 20 den kücük bir tamsayi : ");
        int sayi = scan.nextInt();
        scan.close();
        int fakt = 1;

        System.out.println("----------Benim cözümüm -------------");
        System.out.print(sayi + "! = ");
        for (int i = sayi; i>1 ; i--) {
            fakt = fakt * i ;
            System.out.print(i + " * ");
        }
        System.out.print("1 = " + fakt);

        System.out.println(" ");
        System.out.println("----------Hocanin cözümü------------");
        System.out.println(" ");

        int faktoryel = 1 ;
        System.out.print(sayi + "! = ");
        for (int i = sayi; i >=1 ; i--) {
            faktoryel *= i ;
            if (i != 1) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i);
            }

        }
        System.out.println(" = " + faktoryel);

        }

    }
