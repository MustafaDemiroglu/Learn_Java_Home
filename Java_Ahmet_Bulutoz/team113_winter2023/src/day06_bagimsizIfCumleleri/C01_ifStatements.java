package day06_bagimsizIfCumleleri;

public class C01_ifStatements {

    public static void main(String[] args) {
        /*
         * Buradaki sartlar birbirinden bagimsizdir
         * uygun sayilar olursa 3 if body si de calisabilir
         * bazen de hic bir if body si devreye girmeyebilir
         */


        int a = 20 ;
        int b = 30 ;

        if (a > b) {
            System.out.println("a b'den büyüktür");
        }

        if (a%2 == 0) {
            System.out.println("a cift sayidir");
        }

        if (b > 100) {
            System.out.println("b 100'den büyüktür");
        }
    }
}
