package day12_forLoops;

import java.util.Scanner;

public class C03_ForLoop {

    public static void main(String[] args) {
        // Soru 4 - Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // Sinirlar dahil olarak aralarindaki tüm sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kücük olsa da program calissin

        int bas=0;
        int bit=0;
        int top =0 ;

        Scanner scan = new Scanner(System.in);

        System.out.println("Baslangic dgeri pozitif tamsayi : ");
        bas = scan.nextInt();

        System.out.println("Bitis degeri pozitif tamsayi : ");
        bit = scan.nextInt();

        scan.close();

        System.out.println("----------Benim Cözümüm-----------");

        for (int i = bas; i <= bit; i++) {
            top = top+i;
        }
        System.out.println("Sayilarin toplami : " + top);

        System.out.println("----------------Hocanin cözümü----------");
        int sayilarToplami = 0;
        if (bas <bit) {
            for (int i = bas; i <=bit ; i++) {
                sayilarToplami+=i;
            }
        } else {
            // baslangic edgeri bitis degerinden büyük
            for (int i = bas; i >=bit ; i--) {
                sayilarToplami+=i;
            }
        }
        System.out.println("Sayilarin toplami : " + sayilarToplami);
    }
}
