package day15_doWhileLoop_scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
         * While loop da bitis sarti kontroli her zuaman body den bir fazla calisir
         * while loop da kullaniicidan alacagimiu degelere once bizim deger attamamiz gerekir
         * bu da bazen hatalara sebep olur
         */

        int sayi= 3;
        int toplam= 0;

        while(sayi>0) {
            toplam += sayi*sayi ;
            sayi--;
        }

    }
}
