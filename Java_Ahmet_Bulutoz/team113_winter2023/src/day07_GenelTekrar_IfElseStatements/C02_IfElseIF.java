package day07_GenelTekrar_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseIF {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Dönem sonu Notunuzu Giriniz : ");
        double not = scan.nextDouble();

        if (not>100 || not<0) {
            System.out.println("Notunuzu Yanlis girdiniz. Lütfen tekrar Giriniz : ");
        } else if (not>=85) {
            System.out.println("Tebrikler AA ile gectiniz");
        } else if (not>=65) {
            System.out.println("Tebrikler BB ile gectiniz");
        } else if (not >=50) {
            System.out.println("CC ile gectiniz");
        } else {
            System.out.println("DD--> Maalesef dersten kaldiniz");
        }


    }

}
