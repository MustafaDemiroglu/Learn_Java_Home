package day15_doWhileLoop_scope;

public class C02_RakamlarToplaminiBul {

        //  verilen pozirif bir tamayinin
        // rakamlar toplamini bize döndüren metod olusturun

        public static int rakamlarTopaminiBul(int verilenSayi) {

            int sayi = verilenSayi;
            int birlerBasamagi= 0;
            int rakamlarToplami= 0;

            int basamakSayisi = (sayi+"").length();

            for (int i = 1; i <=basamakSayisi ; i++) {
                birlerBasamagi=sayi%10;
                rakamlarToplami+=birlerBasamagi;
                sayi/=10;
            }

            return rakamlarToplami;

        }
}
