package day06_bagimsizIfCumleleri;

public class C01_ifStatements {

    public static void main(String[] args) {
        /*
         * Buradaki sartlar birbirinden bagimsizdir
         * uygun sayilar olursa 3 if body si de calisabilir
         * bazen de hic bir if body si devreye girmeyebilir
         *
         * kodumuz konsolda hic bir sey yazdirmasa da
         *
         * Process finished with exit code 0
         * yazisini görünce kodun hic bir sorun cikmadan calistigini anliyoruz
         *
         * sadece degerler sartlri saglamadigi icin konsolda bir sey yazdirilmadi
         */


        int a = 13 ;
        int b = 55 ;

        if (a > b) {
            System.out.println("a b'den büyüktür");
        }

        if (a%2 == 0) {
            System.out.println("a cift sayidir");
        }

        if (b > 100) {
            System.out.println("b 100'den büyüktür");
        }

        /*
         * Bazen if statement ta direk boolean bir diger sart olarak yazilabilir
         * budurumda boolean variable degeri true ise if  body calisir
         * false ise if body calismaz
         */

        boolean sonuc = a*7>b;

        if (sonuc) {
            System.out.println("Istenen sartlar saglandi");
        }
    }
}
