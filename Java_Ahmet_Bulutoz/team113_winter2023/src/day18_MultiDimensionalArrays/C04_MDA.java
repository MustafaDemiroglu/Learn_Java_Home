package day18_MultiDimensionalArrays;

public class C04_MDA {
    public static void main(String[] args) {
        String [][] siniflar = {{"A","B","G","M"},{"F","P","A","V"},{"K","D","Q"}};

        // G yi yazdirin
        System.out.println(siniflar[0][2]);

        // Q yu Y yapin
        siniflar[2][2]="Y";

        // ilk sinifin mevcudunu yazdirin
        System.out.println("ilk sinifin mevcudu : "+siniflar[0].length);

        // siniflarda toplam kac kisi oldugunu yazdirin
        System.out.println("okuldaki sinif sayisi : " + siniflar.length);

        int toplamOgrenciSayisi = 0 ;
        for (int i=0; i< siniflar.length; i++) {
            toplamOgrenciSayisi += siniflar[i].length;
        }
        System.out.println("Okuldaki tüm ögrencilerin sayisi : " + toplamOgrenciSayisi);

    }

}
