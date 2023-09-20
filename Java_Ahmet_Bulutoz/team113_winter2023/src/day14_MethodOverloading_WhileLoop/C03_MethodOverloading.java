package day14_MethodOverloading_WhileLoop;

public class C03_MethodOverloading {
    public static void main(String[] args) {
        /*
         * Bir class da ayni isme sahip
         * farkli islem yapan method lar olabilir
         * Java bu method lardan hangisinin calisacagina
         * parametrelere göre karar verir
         *
         * bir class da ismi ayni, parametreleri farkli method'lar olmasina
         * Method Overloading denir.
         */

        String str = "Bu is olacak";
        System.out.println(str.replace("Bu is","Java guzel"));
        System.out.println(str.replace('u','e'));
    }
}
