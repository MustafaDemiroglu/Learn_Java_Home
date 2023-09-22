package day14_MethodOverloading_WhileLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*
         * Baslangic ve bitis degeri belli olan veya kac kere tekrar edilecegi bilinen
         * Loop larda for Loop ideal olarak kullanilabilir
         *
         * Ancak tekrar sayisi belli olmayan
         * baslangic veya bitisi baska bir variable bagli olan durumlarda
         * for Loop yerine while Loop tercih edilir
         */

        //  50 ve 100 arasindaki sinirlar dahil
        //  sayilari toplayiniz


        System.out.println("------ for loop ile bir örnek ----------");
        int toplam = 0;
        for (int i = 50; i <=100 ; i++) {
            toplam+=i;
        }
        System.out.println("For Loop ile Toplam : " + toplam);

        System.out.println("------------while loop ile örnek--------------");
        //  ayni soruyu while loop ile yapalim
        //  for Loop da 3 seyi takip ederiz
        //  1- baslangic degeri
        //  2- bitis sarti
        //  3- artis veya azalis sekli

        int sayi=50;
        int top=0;

        while (sayi<=100){
            top+=sayi;
            sayi++;
        }

        System.out.println(" while ile toplam : " + top);

    }
}
