package day16_Scope_Arrays;

public class C01_Hastane {
    public static void main(String[] args) {
        ADoktor dok1 = new ADoktor();
        dok1.isim = "Kemal";
        dok1.soyisim= "Yasar";
        dok1.dogumYili= 1983;

        System.out.println(dok1.askerlikYaptiMi);       // java default degeri false
        // System.out.println(isim);    // hata verir
        System.out.println(dok1.isim + " " + dok1.soyisim + ", " + dok1.dogumYili);

        ADoktor dok2= new ADoktor();
        System.out.println(dok2.isim);  // henüz atama yapilmadigi icin null verir
        dok2.soyisim = "Celik";
        System.out.println(dok2.soyisim);   // celik

        System.out.println(dok1);
    }
}
