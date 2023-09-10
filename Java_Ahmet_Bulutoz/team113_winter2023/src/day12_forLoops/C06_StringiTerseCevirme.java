package day12_forLoops;

import java.util.Scanner;

public class C06_StringiTerseCevirme {
    public static void main(String[] args) {
        // Soru 10 (Interview) - Kullanicidan bir String isteyin
        // ve Stringi tersine cevirip kaydedin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime veya cümle giriniz");
        String input = scan.nextLine();
        scan.close();

        String output = "";

        for (int i = input.length()-1; i >=0 ; i--) {
            output += input.charAt(i);
        }

        System.out.println(output);

    }
}
