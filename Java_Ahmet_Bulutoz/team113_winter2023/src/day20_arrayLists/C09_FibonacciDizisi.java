package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C09_FibonacciDizisi {
    public static void main(String[] args) {

        // verilen pozitif bir n tamsayisini alarak
        // bize ilkn tane Fibonacci sayisini bir list olarak donduren bir method olusturun

        // Fibonacci : 0 1 1 2 3 5 8 13 21 34 55 89 .......

        int sayiAdedi = 10;

        System.out.println(sayiAdedi + " adet sayi olan fibonacci serisi asagidaki sekilde olmaktadir");
        System.out.println(istenenSayidaFibonacciSayisiListele(sayiAdedi));
        System.out.println(istenenSayidaFibonacciSayisiListele(15));

    }

    public static List<Integer> istenenSayidaFibonacciSayisiListele(int sayiAdedi) {
        List<Integer> fibonacciSerisi = new ArrayList<>();
        int yeniSayi=0;
        int sayi1 = 0;
        int sayi2 = 1;

        fibonacciSerisi.add(sayi1);
        fibonacciSerisi.add(sayi2);

        for (int i = 0; i <sayiAdedi ; i++) {
            yeniSayi=sayi1+sayi2;
            fibonacciSerisi.add(yeniSayi);
            sayi1 = sayi2;
            sayi2 = yeniSayi;
        }
        return fibonacciSerisi;
    }
}
