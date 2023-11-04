package day21_arrayList_forEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        /*
            Bizden istenen görevde sirlama önemsiz ise
            asil amaclanan tüm elementleri elden gecirmek ise
            for Loop yerine for each loop tercih edilir

            for each Loop da
                - index yok
                - baslangic degeri yok
                - bitis degeri yok

         */

        int[] arr ={3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

        // arr in tüm elementlerinin toplamini yazdirin
        int elementlerToplami = 0;
        for (int each:arr) {
            elementlerToplami += each;
        }
        System.out.println("Elementler toplami : " + elementlerToplami);

        // arr in elementlerinden 3 ile bölünebilenleri yazdirin
        int ucIleB

        // arr in elementleri icinde kac tane tek sayi oldugunu bulun


    }
}
