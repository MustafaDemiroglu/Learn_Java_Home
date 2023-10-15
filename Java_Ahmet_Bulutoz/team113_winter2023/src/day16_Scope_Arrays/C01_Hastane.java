package day16_Scope_Arrays;

public class C01_Hastane {
    public static void main(String[] args) {
        ADoktor dok1 = new ADoktor();
        dok1.isim = "Kemal";
        dok1.soyisim= "Yasar";
        dok1.dogumYili= 1983;

        System.out.println(dok1.askerlikYaptiMi);       // java default degeri false
        // System.out.println(isim);    // Hata verir
        System.out.println(dok1.isim + " " + dok1.soyisim + ", " + dok1.dogumYili);

        ADoktor dok2= new ADoktor();
        System.out.println(dok2.isim);  // Henüz atama yapilmadigi icin null verir
        dok2.soyisim = "Celik";
        System.out.println(dok2.soyisim);   // celik

        System.out.println(dok1);       // referansini yazdirir

        System.out.println(dok1.fakulte);   // Tip
        System.out.println(dok2.fakulte);   // Tip

        dok1.isim = "Burcu";
        System.out.println(dok2.isim);      // hala null cünkü hala bir atama yapmadik

        dok1.fakulte = "Cerrahpasa Tip Fakultesi";
        System.out.println(dok2.fakulte);   // Cerrahpasa Tip Fakultesi , cunku variable fakulte static

        ADoktor dok3 = new ADoktor();
        System.out.println(dok3.dogumYili);     // instance variable deger atanmadigi icin default edger yani 0
        System.out.println(dok3.fakulte);   // atama yapmadik ancak variable  statik oldugundan
                                            // en son atanan deger yani Cerrajhpasa Tip Fakültesi
        System.out.println(ADoktor.fakulte);
        // static variable lar icin tavsiye edilen erisim yöntemi
        // classIsmi.staticUyeIsmi seklinde yazilir.
        // Bu kullanim bicimine sttic yöntem denir



    }
}
