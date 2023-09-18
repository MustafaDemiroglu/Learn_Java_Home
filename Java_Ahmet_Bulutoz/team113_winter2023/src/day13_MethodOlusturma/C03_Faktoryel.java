package day13_MethodOlusturma;

public class C03_Faktoryel {
    public static void main(String[] args) {
        // verdigimiz bir sayinin faktöriylini hesaplayip
        // sonucu bize döndüren bir method olusturun

        int sonuc = faktoriyelHesapla(5);
        System.out.println(sonuc);

        /*
         * Method olusturma asamalari
         *  1 - public static standard (simdilik)
         *  2 - olusturdugumuz method biz bir sonuc dondurecek ise
         *      dondurecegi sonucun data turu girilmeli
         *  3 - method ismi
         *  4 - method parantezi () icine method a gondermemiz getreken bilgileri
         *      hangi variable ile gonderecegimizi yaz (parametre)
         *  5 - dondurulmesi istenen islemi yap
         *  6 - return keyword kullanarak dondurulmesi istenen degeri dondur
         */
    }

    public static int faktoriyelHesapla(int sayi){
        int faktoryel = 1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryel *= i ;
        }
        return faktoryel;
    }
}
