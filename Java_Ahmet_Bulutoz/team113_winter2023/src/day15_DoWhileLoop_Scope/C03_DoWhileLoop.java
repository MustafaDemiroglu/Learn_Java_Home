package day15_DoWhileLoop_Scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
         * While loop da bitis sarti kontroli her zuaman body den bir fazla calisir
         * while loop da kullaniicidan alacagimiu degelere once bizim deger attamamiz gerekir
         * bu da bazen hatalara sebep olur
         */

        int sayi= 10;
        int toplam= 0;

        while(sayi>0) {
            toplam += sayi*sayi ;
            sayi--;
        }
        System.out.println("while toplam " + toplam);

        sayi = 10;
        toplam = 0;
        do {
            toplam +=sayi*sayi;
            sayi--;
        } while (sayi>0);
        System.out.println("dowhile toplam " + toplam);



    }
}
