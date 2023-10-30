package day18_MultiDimensionalArrays;

public class C05_MDA {

    public static void main(String[] args) {

        int[][] arr = {{3,5,7},{1,2,3,4},{1,2},{7}};

        // Topam element sayisi kactir
        int toplamElementSayisi = 0 ;
        for (int i = 0; i < arr.length ; i++) {
            toplamElementSayisi += arr[i].length;
        }
        System.out.println("Array deki toplam element sayisi : " + toplamElementSayisi);

        // arraydeki tüm elementlerin degerlerinin toplami

        int arrayElementlerinToplami = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                arrayElementlerinToplami += arr[i][j];
            }
        }
        System.out.println("Arraydeki tüm elementer Toplami : " + arrayElementlerinToplami);



    }
}
