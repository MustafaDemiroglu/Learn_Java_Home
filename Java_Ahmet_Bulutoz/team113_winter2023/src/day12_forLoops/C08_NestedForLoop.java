package day12_forLoops;

public class C08_NestedForLoop {
    public static void main(String[] args) {
        // dinamik olarak verilen satir ve sütun syisina göre
        // yildizlardan bir dikdörtgen olusturun

        /*
         *          * * * * * * * *
         *          * * * * * * * *
         *          * * * * * * * *
         *          * * * * * * * *
         */

        int satirSayisi = 3 ;
        int sutunSayisi = 5 ;

        for (int i = 0; i < satirSayisi ; i++) {
            for (int j = 0; j <sutunSayisi ; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }


    }
}
